package enjoy.patterns.entity.bag;

import enjoy.patterns.entity.Bag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:18
 * @Description:
 */
public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--苹果使用纸箱包装");
    }
}
