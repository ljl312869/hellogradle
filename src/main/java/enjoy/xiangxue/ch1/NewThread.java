package enjoy.xiangxue.ch1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.*;

/**
 * @Description: 创建线程的三种方式
 * @Author: lijunlei
 * @CreateDate: 2019/4/17 8:52
 */
public class NewThread {
    /**
     * 扩展Thread类
     */
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

    private static class ImplRunable implements Runnable{

        @Override
        public void run() {
            System.out.println("I am implements Runnable");
        }
    }

    private static class ImplCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("I am implements Callable<>");
            return "CallableResult";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo:
             threadInfos) {
            System.out.println(threadInfo.getThreadId()+" : "+threadInfo.getThreadName());
        }

        ImplRunable implRunable=new ImplRunable();
        new Thread(implRunable).start();

        ImplCallable implCallable=new ImplCallable();
        FutureTask<String> futureTask = new FutureTask<>(implCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());


    }
}
