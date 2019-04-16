package enjoy.patterns.create.builder.csdn;

/**
 * @Description: Builder模式是为了弥补Java语言设计上的不足，话不多说，下面我们一起来看个栗子就知道啦！
 * @Author: lijunlei
 * @CreateDate: 2019/4/16 9:52
 */
public class User {
    String name;
    int age;
    String phone;
    String email;
    String address;

    public User(){

    }
    ////想要一个名字和邮箱的构造器
    //public User(String name, String email) {
    //    this.name = name;
    //    this.email = email;
    //}
    //
    ////想要一个名字和地址的构造器
    //public User(String name, String address) {
    //    this.name = name;
    //    this.address = address;
    //}
    /**
     *在上面代码中，很容易可以发现，在我们正常的需求下，Java构造器的编写将会出问题，由于参数个数和类型一样无法构成重载，
     * 所以这样写是不行的，那么Builder模式就是为了解决这种情况而出现的
     */


}
