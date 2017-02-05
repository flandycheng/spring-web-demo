package com.fucheng.aop.interceptor;

/**
 * Created by dell on 2017/2/5.
 */
public class DemoInterceptor {

    public void before() {
        System.out.println("before (DemoInterceptor)");
    }

    public void after() {
        System.out.println("After (DemoInterceptor)");
    }
}
