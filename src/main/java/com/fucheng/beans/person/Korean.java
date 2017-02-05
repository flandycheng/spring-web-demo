package com.fucheng.beans.person;

import com.fucheng.myface.Axe;
import com.fucheng.myface.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by dell on 2017/2/4.
 */

public class Korean implements Person, BeanPostProcessor {
    private Axe axe;
    
    public Korean(Axe axe){
        this.axe = axe;
    }
    public void init() {
        System.out.println(this.getClass().toString() + "  is inited ");
    }
    
    @Required
    public void setAxe(Axe axe){
        this.axe  = axe;
    }
    
    public void useAxe(){
        System.out.println(this.getClass().toString() + " 도처 대출증 " + axe.chop());
    }
    public void afterPropertiesSet() {
        System.out.println(this.getClass().toString() + "  is loaded by Container ");
    }
    
    public void destroy() {
        System.out.println(this.getClass().toString() + "  is destroyed by Container ");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}
