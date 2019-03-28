package enjoy.patterns.entity.fruit;

import enjoy.patterns.entity.Fruit;

/**
 * @Description: 桔子
 * @Author: lijunlei
 * @CreateDate: 2019/3/28 13:13
 */
public class Orange implements Fruit{
    private int price=80;
    private String name="";

    public Orange(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("砂糖桔");
    }
}
