package enjoy.patterns.create.builder.csdn;

/**
 * @Description: 如何来调用UserBuilder模式类
 * @Author: lijunlei
 * @CreateDate: 2019/4/16 11:56
 */
public class UserBuilderTest {
    public static void main(String[] args) {
        UserBuilder userBuilder=new UserBuilder.Builder().setAddress("合肥").setName("蓝精灵").setAge(25).setName("李军雷").build();
        System.out.println(userBuilder);
    }
}
