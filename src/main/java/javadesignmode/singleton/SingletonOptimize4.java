package javadesignmode.singleton;

/**
 * @Description: 单例模式
 *      只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的：
 *      考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 * @Author: lijunlei
 * @CreateDate: 2019/3/22 9:40
 */
public class SingletonOptimize4 {

    private static SingletonOptimize4 instance = null;

    private SingletonOptimize4() {
    }

    private static  synchronized void syncInit(){
        if (instance == null) {
            instance = new SingletonOptimize4();
        }
    }

    public static SingletonOptimize4 getInstance(){
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
