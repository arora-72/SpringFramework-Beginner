package com.blk.service;

import org.springframework.stereotype.Component;

@Component
public class DataBase implements DataService {
    @Override
    public String getData() {
        return "fetching Dataa............";
    }
}
