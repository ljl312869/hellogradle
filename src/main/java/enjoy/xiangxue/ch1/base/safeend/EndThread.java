package enjoy.xiangxue.ch1.base.safeend;

/**
 * @Description: 如何中断线程
 *           ps：阻塞方法中抛出InterruptedException异常后，如果需要继续中断，需要手动再中断一次
 * @Author: lijunlei
 * @CreateDate: 2019/4/28 13:38
 */
public class EndThread {
    private static class UseThread extends Thread{

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, name)}.
         *
         * @param name the name of the new thread
         */
        public UseThread(String name) {
            super(name);
        }

        /**
         * If this thread was constructed using a separate
         * <code>Runnable</code> run object, then that
         * <code>Runnable</code> object's <code>run</code> method is called;
         * otherwise, this method does nothing and returns.
         * <p>
         * Subclasses of <code>Thread</code> should override this method.
         *
         * @see #start()
         * @see #stop()
         * @see #Thread(ThreadGroup, Runnable, String)
         */
        @Override
        public void run() {
            super.run();
            String name = Thread.currentThread().getName();
            System.out.println(name+" interrupt flag is "+Thread.currentThread().isInterrupted());

            while(!this.isInterrupted()){
                try {
                    Thread.sleep(100);
                    System.out.println(name+" is running");
                    System.out.println(name+" interrupt flag is "+this.isInterrupted());
                } catch (InterruptedException e) {

                    e.printStackTrace();
                    System.out.println(">"+name+" interrupt flag is "+this.isInterrupted()+"<");
                    interrupt();//阻塞方法中抛出InterruptedException异常后，如果需要继续中断，需要手动再中断一次
                }

            }
            System.out.println(name+" interrupt flag is "+this.isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread endThread = new UseThread("endThread");
        endThread.start();
        Thread.sleep(500);


        endThread.interrupt();//中断线程，其实设置线程的标识位true
    }
}
