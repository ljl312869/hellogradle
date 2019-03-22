package javadesignmode.factorymethod.moremethodfactory;

/**
 * @Description: 多方法工厂类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 11:38
 */
public class MoreMethodSendFactory {
    public Sender productMail(){
        return new MailSender();
    }
    public Sender productSms(){
        return new SmsSender();
    }
}
