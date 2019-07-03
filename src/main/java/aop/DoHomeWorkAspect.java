package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: java类作用描述
 * @Author: lijunlei
 * @CreateDate: 2019/7/1 11:10
 */
@Aspect
@Component
public class DoHomeWorkAspect {
    /** 定义切入点 */
    @Pointcut("execution(* aop.DoHomeWorkController.doHomeWork(..))")
    public void homeWorkPointcut() {
    }

    /** 定义Before advice通知类型处理方法 */
    @Before("homeWorkPointcut()")
    public void beforeHomeWork() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println(request.getParameter("name") + "想先吃个冰淇淋......");
    }

}
