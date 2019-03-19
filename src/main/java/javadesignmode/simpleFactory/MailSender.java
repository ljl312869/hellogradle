package javadesignmode.simpleFactory;

/**
 * @Description: 发送邮件的实现类
 * @Author: lijunlei
 * @CreateDate: 2019/3/19 11:44
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is ams sender");
    }
}
