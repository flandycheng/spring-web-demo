package com.mkyong.app;

import com.mkyong.beans.person.Korean;
import com.mkyong.beans.axe.StoneAxe;
import com.mkyong.factory.PersonConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2017/2/4.
 */
public class FirstContext {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);

        Korean korean = context.getBean("autoKorean", Korean.class);

        korean.setAxe(new StoneAxe());
        korean.useAxe();
    }
}
