package enjoy.patterns.action.visit;

import enjoy.patterns.create.factory.product.fruit.Apple;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:16
 * @Description:
 */
public class Visit {
    //苹果计价
    public int sell(Apple apple){
        System.out.println("apple's price: ￥50");
        return 50;
    }



}
