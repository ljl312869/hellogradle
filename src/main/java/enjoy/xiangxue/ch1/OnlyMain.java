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
        //虚拟机线程管理的接口
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for (ThreadInfo threadInfo:threadMXBean.dumpAllThreads(false,false)) {
            System.out.println(threadInfo.getThreadId()+" ： "+threadInfo.getThreadName());
        }
    }
}
