package javadesignmode.factorymethod.moremethodfactory;

/**
 * @Description: test类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 11:42
 */
public class MoreMethodSendFactoryTest {
    public static void main(String[] args) {
        MoreMethodSendFactory m=new MoreMethodSendFactory();
        Sender mailSender = m.productMail();
        mailSender.send();
        Sender smsSender = m.productSms();
        smsSender.send();

        Sender mailSender2 = m.productMail();

        System.out.println(mailSender.hashCode());
        System.out.println(mailSender2.hashCode());
    }
}
