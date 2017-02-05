package com.fucheng.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by dell on 2017/2/5.
 */
public class DemoAdvice {

    // before通知方法
    public void beforeShow() {
        System.out.println(getClass().toString() + " before show");
    }

    // after通知方法
    public void afterShow() {
        System.out.println(getClass().toString() + " after show");
    }

    // afterReturn通知方法
    public void afterReturnShow() {
        System.out.println(getClass().toString() + " afterReturn show");
    }

    // afterThrowing通知方法
    public void afterThrowingShow() {
        System.out.println(getClass().toString() + " afterThrowing show");
    }

    // around通知方法
    public void aroundShow(ProceedingJoinPoint jpoint) {

        try {
            System.out.println(getClass().toString() + " around before show");
            // 执行目标对象的连接点处的方法
            jpoint.proceed();
            System.out.println(getClass().toString() + " around after show");
        } catch (Throwable e) {
            System.out.println(getClass().toString() + " around afterThrowing show");
        }
    }
}
