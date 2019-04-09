package enjoy.patterns.create.factory.abstractFactory;

import enjoy.patterns.entity.Bag;
import enjoy.patterns.entity.Fruit;

/**
 * @Author: lijunlei
 * @Date: 2019/4/9 23:22
 * @Description: 抽象工厂模式测试 按订单发送货品给客户
 */
public class OrderSendClient {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=null;
        abstractFactory=new OrangeFactory();
        Fruit fruit=abstractFactory.getFruit();
        fruit.draw();
        Bag bag=abstractFactory.getBag();
        bag.pack();
    }
}
