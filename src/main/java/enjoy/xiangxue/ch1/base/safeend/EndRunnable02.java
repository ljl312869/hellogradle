package enjoy.xiangxue.ch1.base.safeend;

/**
 * @Description: java类作用描述
 * @Author: lijunlei
 * @CreateDate: 2019/5/28 14:39
 */
public class EndRunnable02 {

    private static class UseRunnable implements  Runnable{

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
            Thread.currentThread().setName("ThreadUseRunnable");
            String name = Thread.currentThread().getName();
            System.out.println(name + " interrupt flag is "+Thread.currentThread().isInterrupted());
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(name + " is Running");
                System.out.println(name + " interrupt flag is "+Thread.currentThread().isInterrupted());
            }
            System.out.println(name + " interrupt flag is "+Thread.currentThread().isInterrupted());

        }
    }

    public static void main(String[] args) throws InterruptedException {
        UseRunnable useRunnable=new UseRunnable();
        Thread thread=new Thread(useRunnable);
        thread.start();
        Thread.sleep(100);
        thread.interrupt();

    }
}
