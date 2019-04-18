package enjoy.xiangxue.ch1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.*;

/**
 * @Description:
 *  There are two ways to create a new thread of execution.
 *  One is to declare a class to be a subclass of <code>Thread</code>.
 *  The other way to create a thread is to declare a class that implements the <code>Runnable</code> interface.
 * @Author: lijunlei
 * @CreateDate: 2019/4/17 8:52
 */
public class NewThread {

    /** 扩展Thread类*/
    private static class ExtendsThread extends  Thread{

        @Override
        public void run() {
            Thread.currentThread().setName("ExtendsThread");
            System.out.println("I am extends Thread");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    /**实现Runnable接口*/
    //runnable 只是一个任务执行而已，如果自己定义可以是run可以是run1是啥都行，最终启动的还是thread
    private static class ImplRunable implements Runnable{

        @Override
        public void run() {
            System.out.println("I am implements Runnable");
        }
    }

    /**实现Callable<>接口*/
    private static class ImplCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("I am implements Callable<>");
            return 10010;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //java本身就是多线程的
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo:
                threadInfos) {
            System.out.println(threadInfo.getThreadId()+" : "+threadInfo.getThreadName());
        }
        //创建线程的三种方式
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();

        ImplRunable implRunable=new ImplRunable();
        new Thread(implRunable).start();

        ImplCallable implCallable=new ImplCallable();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(implCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());


    }
}
