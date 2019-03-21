package javadesignmode.staticfactory;

/**
 * @Description: 多个静态方法工厂类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 14:02
 */
public class StaticFactory {
    public static Sender productMail(){
        return  new MailSender();
    }

    public static Sender productSms(){
        return new SmsSender();
    }
}
