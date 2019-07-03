package enjoy.xiangxue.ch1;

/**
 * @Description: Start 和 Run方法的区别
 * @Author: lijunlei
 * @CreateDate: 2019/4/18 8:54
 */
public class StratAndRun {
    private static class ThreadRun extends Thread{
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
            int i = 90;
            while(i>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                   // e.printStackTrace();
                }
                System.out.println("I am "+Thread.currentThread().getName()+" and now the i="+i--);
            }

        }
    }

    public static void main(String[] args) {
        ThreadRun threadRun=new ThreadRun();
        threadRun.setName("threadRun");
        threadRun.start();
        //threadRun.run();
        System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>>>>");
    }
}
