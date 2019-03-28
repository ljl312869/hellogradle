package enjoy.patterns.create.factory.simple;

import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.fruit.Apple;

/**
 * @Description: Peter吃苹果
 * @Author: lijunlei
 * @CreateDate: 2019/3/28 13:28
 */
public class StaticFactoryClient {
    //Peter自己吃水果
    public static void main(String[] args) {
        peterdo();
        jamesdo();
        lisondo();
    }
    //Peter自己吃水果
    public static void peterdo(){
        Fruit fruit=StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }

    //James,切开吃
    public static void jamesdo(){
        Fruit fruit=StaticFactory.getFruitBanana();
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }

    //Lison榨汁喝
    public static void lisondo(){
        Fruit fruit=StaticFactory.getFruit(StaticFactory.TYPE_ORANGE);
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }
}
