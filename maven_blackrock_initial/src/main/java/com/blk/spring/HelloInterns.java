package com.blk.spring;

public class HelloInterns {

    private String name;

    public HelloInterns(String name){
        this.setName(name);
    }

    public HelloInterns() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
