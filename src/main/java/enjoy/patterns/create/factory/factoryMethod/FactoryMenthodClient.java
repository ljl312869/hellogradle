package enjoy.patterns.create.factory.factoryMethod;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/4/3 0:07
 * @Description:
 */
public class FactoryMenthodClient {
    private static FruitFactory  fruitFactory=null;
    private static BagFactory bagFactory=null;
    public static void main(String[] args) {
        peterDo();
    }

    public static void peterDo(){

        fruitFactory=new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        bagFactory=new OrangeBagFactory();
        Bag bag = bagFactory.getBag();
        bag.pack();

    }
}
