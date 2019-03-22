package javadesignmode.factorymethod.moremethodfactory;

/**
 * @Description: 发送邮件的实现类
 * @Author: lijunlei
 * @CreateDate: 2019/3/21 11:36
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is mail sender");
    }
}
