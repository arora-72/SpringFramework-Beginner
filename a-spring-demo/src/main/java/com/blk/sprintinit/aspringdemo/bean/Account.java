package com.blk.sprintinit.aspringdemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Account {
//    @Value("10")
    private int id;

    public Account(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
