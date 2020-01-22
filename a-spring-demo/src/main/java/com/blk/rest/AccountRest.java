package com.blk.rest;

import com.blk.service.DataInternet;
import com.blk.service.DataService;
import com.blk.sprintinit.aspringdemo.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRest {



    @Autowired
    private  Account two;


    @Autowired
    @Qualifier("dataInternet")
    private DataService dataService;





    @RequestMapping("/hello")
    public String hello(){

        return "hello  " + two.getId() + dataService.getData();
    }

}
