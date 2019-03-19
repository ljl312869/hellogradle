package javadesignmode.simpleFactory;

/**
 * @Description: 工厂类
 * @Author: lijunlei
 * @CreateDate: 2019/3/19 11:47
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
