package com.mkyong.factory;

import com.mkyong.beans.person.Korean;
import com.mkyong.beans.axe.GoldenAxe;
import com.mkyong.beans.axe.StoneAxe;
import com.mkyong.myface.Axe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
