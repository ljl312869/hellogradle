package enjoy.patterns.create.builder.csdn;

/**
 * @Description: builder模式下如果实现构造器的重载
 * @Author: lijunlei
 * @CreateDate: 2019/4/16 10:53
 */
public class UserBuilder {
    String name;
    int age;
    String phone;
    String email;
    String address;
    //注意 无参构造器私有,避免外界使用构造器创建UserBuilder对象
    private UserBuilder() {
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        String name;
        int age;
        String phone;
        String email;
        String address;

        public Builder(){}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder build() {
            UserBuilder userBuilder = new UserBuilder();
            userBuilder.name = name;
            userBuilder.age = age;
            userBuilder.email = email;
            userBuilder.phone = phone;
            userBuilder.address = address;
            return userBuilder;
        }

    }
}
