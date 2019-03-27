package enjoy.patterns.create.factory;

import enjoy.patterns.create.factory.product.Fruit;
import enjoy.patterns.create.factory.product.fruit.Apple;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:09
 * @Description:  Peter吃苹果 自己栽，自己摘
 */
public class PeterClient {
    //Peter自己吃水果
    public static void main(String[] args) {
        peterdo();
        jamesdo();
        lisondo();
    }
    //Peter自己吃水果
    public static void peterdo(){
        Fruit fruit=new Apple();
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }

    //James,切开吃
    public static void jamesdo(){
        Fruit fruit=new Apple();
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }

   //Lison榨汁喝
    public static void lisondo(){
        Fruit fruit=new Apple();
        fruit.draw();
        //...直接啃着吃
        System.out.println("----------------");
    }
}
