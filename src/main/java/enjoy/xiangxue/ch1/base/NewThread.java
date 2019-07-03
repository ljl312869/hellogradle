package enjoy.xiangxue.ch1.base;

/**
 * @Description: 新启线程的方式
 * @Author: lijunlei
 * @CreateDate: 2019/5/29 16:10
 */
public class NewThread {
    /**
     * 扩展自Thread类
     */
    private static class UseThread extends Thread{
        @Override
        public void run() {
            super.run();
            //do my work
            System.out.println("I am extends Thread");
        }
    }

    /**
     * 实现Runnable接口
     */
    private static class UseRunnable implements Runnable{
        @Override
        public void run() {
            //do my work
            System.out.println("I am implements Runnable");
        }
    }

    public static void main(String[] args) {
        UseRunnable useRunnable=new UseRunnable();
        Thread thread=new Thread(useRunnable);
        thread.start();
        thread.start();

        new UseThread().start();
    }
}
