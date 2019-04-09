package enjoy.patterns.create.builder;

/**
 * @Author: lijunlei
 * @Date: 2019/4/10 0:06
 * @Description: 收银台--导演类
 */
public class FruitMealController {
    public   void construct(){
        Builder builder = new HolidayBuilder();
        builder.buildApple(120);
        builder.buildBanana(80);
        builder.buildOrange(50);
        FruitMeal fruitMeal = builder.getFruitMeal();
        int cost = fruitMeal.cost();
        System.out.println("本套餐花费："+cost);
    }


    public static void main(String[] args) {
        (new FruitMealController()).construct();
    }
}
