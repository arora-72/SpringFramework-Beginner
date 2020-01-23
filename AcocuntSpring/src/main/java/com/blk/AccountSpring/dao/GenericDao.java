package com.blk.AccountSpring.dao;

import java.util.List;

public interface GenericDao<E> {
    public List<E> getAccountList();
    public boolean addAccount(E entity);
}
