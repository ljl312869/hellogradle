package enjoy.patterns.create.factory.abstractFactory;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.bag.BananaBag;
import enjoy.patterns.entity.fruit.Banana;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:19
 * @Description:
 */
public class BananaFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
