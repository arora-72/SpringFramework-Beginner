package com.blk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {


    @Autowired
    private  static PrintMessage message;

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
//        HelloInterns obj = context.getBean("helloInterns", HelloInterns.class);
//        System.out.println(obj.getName());
//
//        HelloInterns obj1 = context.getBean("helloInterns", HelloInterns.class);
//        System.out.println(obj1.getName());

        //PrintMessage pmo = context.getBean("printMessage", PrintMessage.class);
        PrintMessage bean = context.getBean("abc",PrintMessage.class);
        System.out.println(bean.getMessage());
        //context.close();
    }
}
