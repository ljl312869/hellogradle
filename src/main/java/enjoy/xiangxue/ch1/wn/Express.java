package enjoy.xiangxue.ch1.wn;

/**
 * @Author : ljl
 * @Date :2019/4/21 15:12
 * 类说明：快递实体类
 **/
public class Express {
    public final static String CITY="ShangHai";
    /**
     * 快递运输里程数
     */
    private int km;
    /**
     * 快递到达地点
     */
    private String site;

    public Express() {
    }

    public Express(int km, String site) {
        this.km = km;
        this.site = site;
    }

    /**
     * 变化公里数，然后通知处于wait撞他并需要处理公里数的线程进行业务处理
     */
    public synchronized void changeKm (){
        this.km=101;
        notifyAll();
        //其他业务代码
    }

    /**
     * 变化地点，然后通知处于wait状态并需要处理地点的线程惊喜业务处理
     */
    public synchronized void changeSite(){
        this.site = "Beijing";
        notify();
    }

    public synchronized void waitKm(){
        while(this.km <= 100){
            try {
                wait();
                System.out.println("check km thread ["+Thread.currentThread().getId()+"] is be notifed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("the km is "+this.km+" ,I will change db.");
    }

    public synchronized void waitSite(){
        while(CITY.equals(this.site)){
            try {
                wait();
                System.out.println("check site thread ["+Thread.currentThread().getId()+"] is be notifed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("the site is "+this.site+" ,I will call user");

    }
}
