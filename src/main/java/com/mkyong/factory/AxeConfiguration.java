package com.mkyong.factory;

import com.mkyong.beans.axe.GoldenAxe;
import com.mkyong.myface.Axe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by dell on 2017/2/5.
 */
@Configuration
public class AxeConfiguration {
    @Bean
    @Scope("prototype")
    public Axe goldenAxe(){
        return new GoldenAxe();
    }
}
