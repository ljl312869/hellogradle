package enjoy.patterns.create.factory.abstractFactory;


import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.bag.BananaBag;
import enjoy.patterns.entity.bag.OrangeBag;
import enjoy.patterns.entity.fruit.Orange;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:20
 * @Description:
 */
public class OrangeFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Orange(8,"李淑真");
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
