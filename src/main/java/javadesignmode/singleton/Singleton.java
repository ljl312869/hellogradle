package javadesignmode.singleton;

/**
 * @Description: demo of singleton class
 *  不足：这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多
 *  线程环境，肯定会出问题
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 17:31
 */
public class Singleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static  Singleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton(){}

    /**
     * 静态工厂方法，创建实例
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
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
