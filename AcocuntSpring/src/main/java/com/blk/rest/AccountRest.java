package com.blk.rest;

import com.blk.AccountSpring.dao.AccountDao;
import com.blk.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRest {

    @Autowired
    private AccountDao accountDao;



    @RequestMapping("/accounts")
    public String getAccountList(){
        return accountDao.getAccountList().toString();
    }

    @PostMapping("/account")
    public boolean addAccount(@RequestBody Account a){
        return accountDao.addAccount(a);
    }

}
