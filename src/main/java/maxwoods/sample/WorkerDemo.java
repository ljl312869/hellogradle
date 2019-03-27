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


}
