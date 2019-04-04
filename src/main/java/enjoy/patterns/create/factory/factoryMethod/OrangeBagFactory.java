package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.bag.OrangeBag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:24
 * @Description:
 */
public class OrangeBagFactory implements BagFactory {
    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
