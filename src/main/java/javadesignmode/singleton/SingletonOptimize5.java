package javadesignmode.singleton;

import java.util.Vector;

/**
 * @Description: 采用"影子实例"的办法为单例对象的属性同步更新
 * @Author: lijunlei
 * @CreateDate: 2019/3/22 10:06
 */
public class SingletonOptimize5 {

    private static SingletonOptimize5 instance=null;
    private Vector properties = null;

    public  Vector getProperties(){
        return properties;
    }

    private SingletonOptimize5() {
    }

    private static synchronized void syncInit(){
        if (instance == null) {
            instance=new SingletonOptimize5();
        }
    }

    public static SingletonOptimize5 getInstance(){
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        SingletonOptimize5 shadow =new SingletonOptimize5();
        properties =shadow.getProperties();
    }


}
