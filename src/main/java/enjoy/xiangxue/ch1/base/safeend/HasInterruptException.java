package enjoy.xiangxue.ch1.base.safeend;

/**
 * @Description: 阻塞方法中抛出InterruptedException异常后，如果需要继续中断，需要手动再中断一次
 * @Author: lijunlei
 * @CreateDate: 2019/5/29 14:10
 */
public class HasInterruptException {
    private static class UserThread extends Thread{

        /**
         * Allocates a new {@code Thread} object. This constructor has the same
         * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
         * {@code (null, null, name)}.
         *
         * @param name the name of the new thread
         */
        public UserThread(String name) {
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

            while (!isInterrupted()){
                System.out.println(Thread.currentThread().getName() +" interrupt flag0 is " + isInterrupted() );
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() +" interrupt flag1 is " + isInterrupted() );
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() +" interrupt flag2 is " + isInterrupted() );
                    e.printStackTrace();
                    interrupt();
                    System.out.println(Thread.currentThread().getName() +" interrupt flag3 is " + isInterrupted() );

                }

            }
            System.out.println(Thread.currentThread().getName() +" interrupt flag4 is " + isInterrupted() );

        }


    }
    public static void main(String[] args) throws InterruptedException {
        UserThread userThread=new UserThread("hasInterruptEx");
        userThread.start();
        Thread.sleep(500);
        userThread.interrupt();

    }
}
