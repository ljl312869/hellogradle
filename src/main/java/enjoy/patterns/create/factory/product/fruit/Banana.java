package enjoy.patterns.create.factory.product.fruit;

import enjoy.patterns.action.visit.Visit;
import enjoy.patterns.create.factory.product.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:27
 * @Description: 香蕉
 */
public class Banana implements Fruit {

    private int price = 60;
    public Banana() {
        super();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("仙人蕉");
    }

    @Override
    public int accept(Visit visit) {
        return 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
