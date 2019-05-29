package enjoy.xiangxue.ch1.base.safeend;

/**
 * @Description: 如何安全的中断线程
 * @Author: lijunlei
 * @CreateDate: 2019/5/28 14:39
 */
public class EndThread02 {
    public static class UseThread extends Thread{
        @Override
        public void run(){
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName + " interrupt flag = "+isInterrupted());
            while(!isInterrupted()){
                System.out.println(threadName + " is Running ");
                System.out.println(threadName + "intrrrupt flag = "+isInterrupted());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(threadName + "<1><1>intrrrupt flag = "+isInterrupted());
                    interrupt();
                    System.out.println(threadName + "<2><2>intrrrupt flag = "+isInterrupted());
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "intrrrupt flag = "+isInterrupted());

        }
    }

    public static void main(String[] args) throws Exception {
        UseThread useThread = new UseThread();
        useThread.start();
        useThread.sleep(1000);
        useThread.interrupt();

    }
}
