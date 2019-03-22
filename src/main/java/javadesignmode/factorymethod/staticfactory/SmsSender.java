package javadesignmode.factorymethod.staticfactory;

/**
 * @Description: java类作用描述
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 14:00
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender");
    }
}
