package enjoy.xiangxue.ch1.wn;

/**
 * @Author : ljl
 * @Date :2019/4/21 15:29
 * 类说明：测试wait/notify/notifyAll
 **/
public class TeatWN {

    private static Express express=new Express(0,Express.CITY);

    /**
     * 检查里程数变化的线程，不满足条件线程一直等待
     */
    private static class CheckKm extends Thread{
        @Override
        public void run() {
            express.waitKm();
        }
    }

    private static class CheckSite extends Thread{

        @Override
        public void run() {
            express.waitSite();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <3 ; i++) {
            new CheckKm().start();
        }
        for (int i = 0; i <3 ; i++) {
            new CheckSite().start();
        }
        Thread.sleep(1000);
        express.changeKm();//快递地点变化
    }
}
