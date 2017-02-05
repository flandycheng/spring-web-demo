package com.fucheng.aop.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/2/5.
 */
@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public * com.fucheng.service.*.*(..))")
    public void myMethod() {
    }

    @Before("myMethod()")
    public void before() {
        System.out.println("=========================================method start");
    }

    @After("myMethod()")
    public void after() {
        System.out.println("=========================================method after");
    }
}
