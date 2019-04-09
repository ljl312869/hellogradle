package enjoy.patterns.create.builder;

import enjoy.patterns.entity.fruit.*;

/**
 * @Author: lijunlei
 * @Date: 2019/4/10 0:23
 * @Description:
 */
public class OldCustomerBuilder implements Builder {
    FruitMeal fruitMeal=new FruitMeal();

    @Override
    public void buildApple(int price) {
        Apple apple=new Apple();
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
        Orange orange=new Orange(price,"Lisa");
        fruitMeal.setOrange(orange);
    }

    @Override
    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(10);
        fruitMeal.init();
        return fruitMeal;
    }
}
