package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.fruit.Orange;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:03
 * @Description:
 */
public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Orange(50,"lishuzhen");
    }
}
