package com.blk.service;

import org.springframework.stereotype.Component;

@Component
public class DataInternet  implements  DataService{

    @Override
    public String getData() {
        return "dbahbda";
    }
}
