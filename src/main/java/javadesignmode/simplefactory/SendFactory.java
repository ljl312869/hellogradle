package javadesignmode.simplefactory;

/**
 * @Description: 简单工厂类
 * @Author: lijunlei
 * @CreateDate: 2019/3/19 11:47
 */
public class SendFactory {
    /**
     * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
     * @param type
     * @return
     */
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
