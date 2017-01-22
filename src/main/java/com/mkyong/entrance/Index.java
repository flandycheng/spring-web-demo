package com.mkyong.entrance;

import com.mkyong.beans.Gaoqi1;
import com.mkyong.beans.Gaoqi2;
import com.mkyong.myface.Person;
import com.mkyong.testevent.EmailEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Index {


    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_test.xml");
        Gaoqi1 gq1 = (Gaoqi1) context.getBean("bean1");

        //test bean scope
        System.out.println(context.getBean("bean1"));
        System.out.println(context.getBean("bean1"));
        System.out.println(context.getBean("bean1"));
        System.out.println(context.getBean("bean1"));
        System.out.println(context.getBean("bean2"));
        System.out.println(context.getBean("bean2"));
        System.out.println(context.getBean(Gaoqi2.class));
        System.out.println(context.getBean(Gaoqi2.class).getContext());

//        System.out.println(new Function<String,String>() {
//            public String apply(String a){
//                System.out.println(a);
//                return "good result";
//            }
//        }.apply("shit"));

        //test event
        EmailEvent ev = new EmailEvent("hell","zhhh@1643.com","zhhh");
        context.publishEvent(ev);
        context.publishEvent(ev);
        context.publishEvent(new EmailEvent(gq1,"zhhh@1643.com","zhhh"));


        Person person = context.getBean("chinese",Person.class);
        person.useAxe();

        Person person2 = context.getBean("japanese",Person.class);
        person2.useAxe();
    }
}
