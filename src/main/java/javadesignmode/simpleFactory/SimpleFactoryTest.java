package javadesignmode.simpleFactory;

/**
 * @Description: java类作用描述
 * @Author: lijunlei
 * @CreateDate: 2019/3/19 11:52
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SendFactory factory=new SendFactory();
        Sender sender=factory.produce("mail");
        if(null!=sender){
            sender.Send();
        }
    }
}
