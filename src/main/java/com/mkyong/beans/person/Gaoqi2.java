package com.mkyong.beans.person;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Gaoqi2 implements ApplicationContextAware {

    private ApplicationContext cxt;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.cxt = context;
    }

    public ApplicationContext getContext() {
        return this.cxt;
    }

}
