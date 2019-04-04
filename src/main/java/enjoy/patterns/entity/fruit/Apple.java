package enjoy.patterns.entity.fruit;


import enjoy.patterns.entity.Fruit;

/**
 * @Description: 苹果
 * @Author: lijunlei
 * @CreateDate: 2019/3/28 12:23
 */
public class Apple implements Fruit {
    private int price = 50;


    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.print("富士康苹果");
    }


}
