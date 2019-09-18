package enjoy.xiangxue.ch1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Description: java的多线程无处不在
 * @Author: lijunlei
 * @CreateDate: 2019/4/17 10:19
 */
public class OnlyMain {
    public static void main(String[] args) {
        ////虚拟机线程管理的接口
        //ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //for (ThreadInfo threadInfo:threadMXBean.dumpAllThreads(false,false)) {
        //    System.out.println(threadInfo.getThreadId()+" ： "+threadInfo.getThreadName());
        //}


        ThreadMXBean threadMXBean1 = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean1.dumpAllThreads(false, false);
        for (ThreadInfo t:threadInfos) {
            System.out.println(t.getThreadId()+" || "+t.getThreadName());
        }


        ////前提为a、b均不能为null
        //if(a.compareTo(b) == -1){
        //    System.out.println("a小于b");
        //}
        //
        //if(a.compareTo(b) == 0){
        //    System.out.println("a等于b");
        //}
        //
        //if(a.compareTo(b) == 1){
        //    System.out.println("a大于b");
        //}
        //
        //if(a.compareTo(b) > -1){
        //    System.out.println("a大于等于b");
        //}
        //
        //if(a.compareTo(b) < 1){
        //    System.out.println("a小于等于b");
        //}
    }
}
