package enjoy.patterns.create.factory.product.fruit;

import enjoy.patterns.action.visit.Visit;
import enjoy.patterns.create.factory.product.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:27
 * @Description: 桔子
 */
public class Orange implements Fruit {
    private String name="";
    private int price =70;


    public Orange(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("砂糖橘");
    }

    @Override
    public int accept(Visit visit) {
        return 0;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
