package com.blk.AccountSpring.dao;

import com.blk.models.Account;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;


import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDao {

    private List<Account> accountList = new ArrayList<Account>();



    @PostConstruct
    public void init(){
        Account a1 = new Account("kakashi", "savings", 20200);
        Account a2 = new Account("js", "savings", 20200);
        Account a3 = new Account("as", "savings", 20220);
        Account a4 = new Account("r", "savings", 202030);
        Account a5 = new Account("t", "savings", 20200);

        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a3);
        accountList.add(a4);
        accountList.add(a5);

    }

    public List<Account> getAccountList(){
        return accountList;
    }

    public boolean addAccount(Account a){
        return accountList.add(a);
    }



}
