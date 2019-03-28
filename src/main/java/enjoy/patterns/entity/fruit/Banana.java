package enjoy.patterns.entity.fruit;

import enjoy.patterns.entity.Fruit;

/**
 * @Description: 香蕉
 * @Author: lijunlei
 * @CreateDate: 2019/3/28 13:12
 */
public class Banana implements Fruit{
    private int price=70;

    public Banana() {
    }

    public Banana(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("仙人蕉");
    }
}
