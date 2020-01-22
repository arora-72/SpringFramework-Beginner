package com.blk.sprintinit.aspringdemo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppBeans {

    @Bean
    public Account ten(){
        return new Account(10);
    }

    @Bean
    public Account two() {
        return new Account(2);
    }
}
