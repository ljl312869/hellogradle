package enjoy.patterns.create.factory.product.fruit;

import enjoy.patterns.action.visit.Visit;
import enjoy.patterns.create.factory.product.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:20
 * @Description:
 */
public class Apple implements Fruit {
    private int price =100;

    public Apple() {
    }

    public Apple(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("红富士苹果");
    }

    @Override
    public int accept(Visit visit) {
        return 0;
    }



    public void setPrice(int price) {
        this.price = price;
    }
}
