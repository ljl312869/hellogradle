package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.fruit.Apple;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:01
 * @Description:
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
