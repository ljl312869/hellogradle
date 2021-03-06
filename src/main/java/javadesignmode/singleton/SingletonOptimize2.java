package javadesignmode.singleton;

/**
 * @Description: 对SingletonOptimize1的改进 有在第一次创建对象的时候加锁
 *  不足;这样的情况，还是有可能有问题的，看下面的情况：在Java指令中创建对象和赋值操作是分开进行的，
 *      也就是说instance = new SingletonOptimize2();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序(JVM指令的重排序)，
 *      也就是说有可能JVM会为新的SingletonOptimize2实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
 *      我们以A、B两个线程为例：
 *      a>A、B线程同时进入了第一个if判断
 *      b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
 *      c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
 *        并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
 *      d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
 *      e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 *      所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，
 *      有挑战性。我们对该程序做进一步优化(见SingletonOptimize3)：
 * @Author: lijunlei
 * @CreateDate: 2019/3/22 8:33
 */
public class SingletonOptimize2 {

    /**
     * 持有私有静态实例，防止被引用
     * 此处赋值为null，是为了实现延迟加载
     */
    private static SingletonOptimize2 instance=null;

    /**
     * 私有化构造方法，防止被实例化
     */
    private SingletonOptimize2(){}

    /**
     * 静态工厂方法，创建实例
     * @return
     */
    public static SingletonOptimize2 getInstance(){
        if (instance == null) {
            //似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，
            //只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升。
            synchronized (instance){
                if (instance == null) {
                    instance=new SingletonOptimize2();//在Java指令中是分开进行的
                }
            }
        }
        return instance;
    }

    /**
     * 如果该对象用于被序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public Object readResolve(){
        return instance;
    }
}
