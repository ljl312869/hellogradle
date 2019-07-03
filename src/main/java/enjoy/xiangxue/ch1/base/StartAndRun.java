package enjoy.xiangxue.ch1.base;

/**
 * @Description: StartAndRun在执行上的区别
 * @Author: lijunlei
 * @CreateDate: 2019/5/29 16:30
 */
public class StartAndRun {
    private static class ThreadRun extends Thread{
        @Override
        public void run() {
            super.run();
            int i = 90;

            System.out.println("I am "+Thread.currentThread().getName()+" and now the i="+i--);
        }
    }

    public static void main(String[] args) {
        ThreadRun threadRun = new ThreadRun();
        threadRun.setName("threadRun");
        threadRun.start();
    }
}
