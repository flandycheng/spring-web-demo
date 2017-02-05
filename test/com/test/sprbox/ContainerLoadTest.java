package com.test.sprbox;

import com.fucheng.beans.person.Chinese;
import com.fucheng.beans.person.Japanese;
import com.fucheng.beans.person.Korean;
import com.fucheng.beans.axe.GoldenAxe;
import com.fucheng.factory.PersonConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/2/4.
 */
public class ContainerLoadTest {

    @Test
    public void abstractTest() {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean_test.xml");

        Chinese chinese = context.getBean("chinese", Chinese.class);
        Japanese japanese = (Japanese) context.getBean("japanese");

        chinese.useAxe();
        japanese.useAxe();

        context.registerShutdownHook();

    }

    @Test
    public void xmlTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean_test.xml");

        Chinese chinese = context.getBean("chinese", Chinese.class);
        Japanese japanese = (Japanese) context.getBean("japanese");

        chinese.useAxe();
        japanese.useAxe();

    }

    @Test
    public void annotationTest() {

       // ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PersonConfiguration.class);
        context.refresh();
        Korean korean = context.getBean("autoKorean", Korean.class);
        korean.useAxe();
        System.out.println(" I want a golden axe  ^_^ ");
        GoldenAxe goldenAxe = context.getBean("goldenAxe",GoldenAxe.class);
        korean.setAxe(goldenAxe);
        korean.useAxe();
        //test whether is a new axe
        GoldenAxe goldenAxe2 = context.getBean("goldenAxe",GoldenAxe.class);
        korean.setAxe(goldenAxe2);
        korean.useAxe();

    }


}
