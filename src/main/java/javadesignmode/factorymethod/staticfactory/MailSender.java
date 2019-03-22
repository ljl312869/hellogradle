package javadesignmode.factorymethod.staticfactory;

/**
 * @Description: 发送邮件的类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 13:59
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is mail sender");
    }
}
