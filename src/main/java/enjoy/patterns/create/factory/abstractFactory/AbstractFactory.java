package enjoy.patterns.create.factory.abstractFactory;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:17
 * @Description: 抽象水果工厂
 */
public abstract class AbstractFactory {
    public abstract Fruit getFruit();

    public abstract Bag getBag();
}
