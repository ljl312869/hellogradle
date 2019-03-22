package javadesignmode.factorymethod.moremethodfactory;

/**
 * @Description: 短信发送的实现类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 11:37
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender");
    }
}
