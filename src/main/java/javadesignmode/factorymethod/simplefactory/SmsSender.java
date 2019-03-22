package javadesignmode.factorymethod.simplefactory;

/**
 * @Description: 发送短信的实现类
 * @Author: lijunlei
 * @CreateDate: 2019/3/19 11:45
 */
public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("this is sms sender");
    }
}
