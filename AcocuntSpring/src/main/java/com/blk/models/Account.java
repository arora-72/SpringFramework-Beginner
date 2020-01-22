package com.blk.models;

public class Account {
    private String name;
    private String accType;
    private Integer balance;

    public Account(String name, String accType, Integer balance) {
        this.name = name;
        this.accType = accType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account\n{" +
                "name='" + name + '\'' +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                "}" + "\r" + "\n" ;
    }
}
