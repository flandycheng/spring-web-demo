package com.fucheng.factory;

import com.fucheng.beans.axe.GoldenAxe;
import com.fucheng.myface.Axe;
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
