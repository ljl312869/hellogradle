package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.fruit.Banana;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:02
 * @Description:
 */
public class BananFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
