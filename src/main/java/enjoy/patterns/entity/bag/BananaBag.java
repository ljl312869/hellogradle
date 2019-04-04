package enjoy.patterns.entity.bag;

import enjoy.patterns.entity.Bag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:19
 * @Description:
 */
public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--香蕉使用竹萝包装");
    }
}
