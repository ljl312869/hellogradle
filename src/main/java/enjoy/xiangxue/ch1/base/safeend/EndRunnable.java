package enjoy.xiangxue.ch1.base.safeend;

/**
 * @Description: 实现接口Runnable的线程如何中断
 * @Author: lijunlei
 * @CreateDate: 2019/4/26 17:25
 */
public class EndRunnable {

    private static class UserRunnable implements Runnable{

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName() + " I am implements Runnable");
            }
            System.out.println(Thread.currentThread().getName()+" interrupt flag is "+ Thread.currentThread().isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UserRunnable userRunnable = new UserRunnable();
        Thread endThread = new Thread(userRunnable, "endThread");
        endThread.start();
        Thread.sleep(20);
        endThread.interrupt();


    }

}
