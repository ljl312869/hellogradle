package enjoy.patterns.action.visit;


import enjoy.patterns.entity.fruit.Apple;
import enjoy.patterns.entity.fruit.Banana;
import enjoy.patterns.entity.fruit.Orange;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:16
 * @Description:
 */
public class Visit {
    //苹果计价
    public int sell(Apple apple){
        System.out.println("apple's price: ￥"+apple.price());
        return apple.price();
    }

    //桔子计价
    public int sell(Orange orange){
        System.out.println("apple's price: ￥"+orange.price());
        return orange.price();
    }

    //香蕉计价
    public int sell(Banana banana){
        System.out.println("apple's price: ￥"+banana.price());
        return banana.price();
    }



}
