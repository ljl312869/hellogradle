package enjoy.patterns.entity.bag;

import enjoy.patterns.entity.Bag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:21
 * @Description:
 */
public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--桔子使用袋子包装");
    }
}
