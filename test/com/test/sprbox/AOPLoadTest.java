package com.test.sprbox;

import com.fucheng.service.PlayerService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/2/5.
 */
public class AOPLoadTest {
    public static ApplicationContext context;

    @BeforeClass
    public static void prepareContext() {
        String[] sources = new String[]{"autoscan_test.xml","aop_test.xml"};
        context = new ClassPathXmlApplicationContext(sources);
    }

    @Test
    public void autoScanToContext() {
        PlayerService playerService = context.getBean("playerService", PlayerService.class);
        playerService.login();
        System.out.println(playerService);
    }

    @AfterClass
    public static void finished() {
        System.out.println(context.getBeanDefinitionNames().toString());
        context = null;
        System.out.println("Test Is Done");
    }

}
