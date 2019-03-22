package javadesignmode.singleton;



/**
 * @Description: 对getInstance()加synchronized关键字,以适应多线程环境
 * 不足：synchronized关键字锁住的是这个对象，这样的用法在性能上可能会有所下降，因为每次调用getInstance(),
 * 都要对对象上锁，只有在第一次创建对象的时候需要加锁，之后就不需要，所以这个地方需要改进。改成SingletonOptimize2类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 17:52
 */
public class SingletonOptimize1 {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static SingletonOptimize1 instance = null;
    /**
     * 私有构造方法，防止被实例化
     */
    private SingletonOptimize1() {
    }

    /**
     * 静态工厂方法创建实例
     */
    public static synchronized SingletonOptimize1 getInstance(){
        if (instance == null) {
            instance = new SingletonOptimize1();
        }
        return instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @return
     */
    public Object readResolve(){
        return instance;
    }
}
