package app.dhananjay.springbankapp.services;

import app.dhananjay.springbankapp.model.Account;

import java.util.List;

public interface AccountService {
    public boolean saveAccount(Account account);

    public List<Account> getAccounts();

    public Account getAccount(Integer accountNo);

    public boolean deleteAccount(int accountNo);
}
