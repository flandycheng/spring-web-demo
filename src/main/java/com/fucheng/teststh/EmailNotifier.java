package com.fucheng.teststh;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class EmailNotifier implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent e) {
        if (e instanceof EmailEvent) {

            System.out.println("自定义的事件:" + e);
            EmailEvent emailEvent = (EmailEvent) e;
            System.out.println("需要发送邮件的接收地址为:" + emailEvent.getAddress());

            System.out.println("需要发送邮件的邮件正文是:" + emailEvent.getText());
        } else {
            //容器内置事件不作任何处理
            System.out.println("容器本身的事件:" + e);
        }

    }
}


