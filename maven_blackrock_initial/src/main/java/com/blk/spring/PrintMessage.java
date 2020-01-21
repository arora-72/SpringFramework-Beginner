package com.blk.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class PrintMessage  {

    @Value("test1")
    private String message;

//    public PrintMessage(String message) {
//        this.message = message;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroying ");
    }
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean");
    }


}
