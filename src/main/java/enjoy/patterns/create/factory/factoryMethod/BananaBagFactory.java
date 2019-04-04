package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.bag.BananaBag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:23
 * @Description:
 */
public class BananaBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
