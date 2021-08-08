package com.yt.springbootmybatis.annotation;

import com.yt.springbootmybatis.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @USER: Young
 * @DATETIME: 2021/2/8
 * @DESCRIPTION:
 **/
@Component
@Aspect
public class AspectDemo {

    @Pointcut("@annotation(com.yt.springbootmybatis.annotation.PreAuth))")
    public void pointCut(){}

    @Around("pointCut()&&@annotation(preAuth)")
    public Object before(ProceedingJoinPoint point, PreAuth preAuth) throws Throwable {
        System.out.println(preAuth.value());
        System.out.println(point.getArgs());
        System.out.println(point.getSignature().getName());
        System.out.println(point.getTarget());


        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Integer) {
                args[i] = (Integer)args[i] + 1;
            }
        }

        Object result = point.proceed(args);
        if (result instanceof User) {
            User user = (User)result;
            user.setAge(user.getAge() -2);
        }
        return result;
    }
}
