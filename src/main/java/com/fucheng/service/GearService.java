package com.fucheng.service;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/2/5.
 */
@Service
public class GearService {


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After Initialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}
