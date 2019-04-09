package enjoy.patterns.create.builder;

import enjoy.patterns.entity.fruit.*;

/**
 * @Author: lijunlei
 * @Date: 2019/4/10 0:09
 * @Description:
 */
public class HolidayBuilder implements Builder {
    private FruitMeal fruitMeal=new FruitMeal();
    @Override
    public void buildApple(int price) {
        Apple apple =new Apple();
        apple.setPrice(price);
        fruitMeal.setApple(apple);

    }

    @Override
    public void buildBanana(int price) {
        Banana banana=new Banana();
        banana.setPrice(price);
        fruitMeal.setBanana(banana);
    }

    @Override
    public void buildOrange(int price) {
        Orange orange =new Orange(9,"李淑真");
        orange.setPrice(price);
        fruitMeal.setOrange(orange);
    }

    @Override
    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(15);//折扣价格对于一个套餐来说，是固定的
        fruitMeal.init();
        return fruitMeal;
    }
}
