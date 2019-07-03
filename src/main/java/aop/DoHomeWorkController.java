package aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 连接点
 * @Author: lijunlei
 * @CreateDate: 2019/7/1 11:08
 */
@RestController
public class DoHomeWorkController {
    @GetMapping("/dohomework")
    public void doHomeWork(String name){
        System.out.println(name + "做作业... ...");
    }

}

