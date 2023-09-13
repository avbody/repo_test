package cn.random.service;

import cn.random.domain.Account;

import java.util.List;

public interface AccountService {
    public void saveAccount(Account account);
    public List<Account> findAll();
}
