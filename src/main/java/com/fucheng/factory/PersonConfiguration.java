package com.fucheng.factory;

import com.fucheng.beans.person.Korean;
import com.fucheng.beans.axe.GoldenAxe;
import com.fucheng.beans.axe.StoneAxe;
import com.fucheng.myface.Axe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Date;

/**
 * Created by dell on 2017/2/4.
 */
@Configuration
@Import(AxeConfiguration.class)
public class PersonConfiguration {
    @Bean
    public Korean autoKorean(){
        return new Korean(autoAxe()); //bean dependency
    }
    @Bean
    public Korean autoKoreanWithGoldenAxe(){
        return new Korean(new GoldenAxe());
    }
    
    @Bean
    public Axe autoAxe(){
        return new StoneAxe();
    }
}
