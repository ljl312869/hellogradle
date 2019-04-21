package maxwoods.sample;

import lombok.Data;

/**
 * @Description: lombok Demo
 * @Author: lijunlei
 * @CreateDate: 2019/3/27 11:14
 */
@Data
public class WorkerDemo {
    private String name;
    private String password;
    private String profession;

    public static void main(String[] args) {
        WorkerDemo demo = new WorkerDemo();
        demo.setName("李淑真");
        demo.setProfession("docter");
        System.out.println(demo.getName()+" "+demo.getProfession());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
