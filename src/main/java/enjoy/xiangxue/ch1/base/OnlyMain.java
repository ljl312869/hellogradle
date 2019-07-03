package enjoy.xiangxue.ch1.base;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Description: 只有一个main方法
 * @Author: lijunlei
 * @CreateDate: 2019/5/29 16:17
 */
public class OnlyMain {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo:threadInfos) {
            System.out.println("["+threadInfo.getThreadId()+"] "+threadInfo.getThreadName());
        }
    }
}
