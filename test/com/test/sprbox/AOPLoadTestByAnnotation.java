package com.test.sprbox;

import com.fucheng.service.RankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;


/**
 * Created by dell on 2017/2/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:autoscan_test.xml","classpath:aop_test.xml"})
public class AOPLoadTestByAnnotation {
    @Autowired
    private RankService rankService;
    
    @Test public void testService(){
        rankService.refreshRanking((new Random()).nextInt());
        rankService.refreshRanking((new Random()).nextInt());
    }
}
