package enjoy.patterns.create.factory.abstractFactory;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.bag.AppleBag;
import enjoy.patterns.entity.fruit.Apple;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:19
 * @Description: 水果工厂
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
