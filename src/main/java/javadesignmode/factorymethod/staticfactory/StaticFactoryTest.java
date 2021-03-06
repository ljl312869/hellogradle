package javadesignmode.factorymethod.staticfactory;

/**
 * @Description: java类作用描述
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 14:05
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        Sender sender = StaticFactory.productMail();
        sender.send();
        Sender sender2 = StaticFactory.productMail();
        System.out.println(sender.hashCode());
        System.out.println(sender2.hashCode());
    }
}
