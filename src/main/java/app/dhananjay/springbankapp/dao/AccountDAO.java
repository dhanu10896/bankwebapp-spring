package app.dhananjay.springbankapp.dao;

import app.dhananjay.springbankapp.model.Account;
import java.util.List;

public interface AccountDAO {

    public boolean saveAccount(Account account);

    public boolean updateAccount(Account account);

    public List<Account> getAccounts();

    public Account getAccount(Integer accountNo);

    public boolean deleteAccount(int accountNo);

}
