package enjoy.patterns.create.builder;

import enjoy.patterns.entity.fruit.*;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:48
 * @Description: 创建一个水果套餐类
 */
public class FruitMeal {
    private Apple apple;//苹果--价格
    private Banana banana;//香蕉价格
    private Orange orange;//桔子价格
    private int discount;//折扣价

    private int totalPrice;//套餐总价

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int cost(){
        return this.totalPrice;
    }

    public void init(){
        if (apple != null) {
            totalPrice +=apple.price();
        }
        if (orange != null) {
            totalPrice +=orange.price();
        }
        if (banana != null) {
            totalPrice +=banana.price();
        }
        if(totalPrice > 0){
            totalPrice -= discount;
        }
    }

    public void showItems(){
        System.out.println("totalPrice：" + totalPrice);
    }
}
