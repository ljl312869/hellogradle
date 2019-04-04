package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.bag.AppleBag;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:16
 * @Description:
 */
public class AppleBagFactory implements BagFactory {

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
