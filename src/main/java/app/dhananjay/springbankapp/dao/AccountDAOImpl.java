package app.dhananjay.springbankapp.dao;

import app.dhananjay.springbankapp.entity.AccountEntity;
import app.dhananjay.springbankapp.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveAccount(Account account) {
        boolean saveFlag = true;
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccNo(account.getAccountNo());
        accountEntity.setAccHolderName(account.getAccountHolderName());
        accountEntity.setBalance(account.getBalance());
        accountEntity.setAccountType(account.getAccountType());
        accountEntity.setDateOfBirth(account.getDateOfBirth());
        accountEntity.setPsCode(account.getPsCode());
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(accountEntity);
        } catch (Exception e) {
            e.printStackTrace();
            saveFlag = false;
        }
        return saveFlag;
    }

    @Override
    public boolean updateAccount(Account account) {
        boolean saveFlag = true;
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccNo(account.getAccountNo());
        accountEntity.setAccHolderName(account.getAccountHolderName());
        accountEntity.setBalance(account.getBalance());
        accountEntity.setAccountType(account.getAccountType());
        accountEntity.setDateOfBirth(account.getDateOfBirth());
        accountEntity.setPsCode(account.getPsCode());
        try {
            Session session = sessionFactory.getCurrentSession();
            session.update(accountEntity);
        } catch (Exception e) {
            e.printStackTrace();
            saveFlag = false;
        }
        return saveFlag;    }

    @Override
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Query<AccountEntity> query = session.createQuery("From AccountEntity", AccountEntity.class);
            List<AccountEntity> accountEntities = query.getResultList();
            accountEntities.forEach(accountEntity -> {
                Account account = new Account();
                account.setAccountNo(accountEntity.getAccNo());
                account.setAccountHolderName(accountEntity.getAccHolderName());
                account.setBalance(accountEntity.getBalance());
                account.setAccountType(accountEntity.getAccountType());
                account.setDateOfBirth(accountEntity.getDateOfBirth());
                account.setPsCode(accountEntity.getPsCode());
                accounts.add(account);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public Account getAccount(Integer accountNo) {
        Account account = new Account();
        try {
            Session session = sessionFactory.getCurrentSession();
            AccountEntity accountEntity = session.get(AccountEntity.class, accountNo);

            if (accountEntity == null) return null;

            account.setAccountNo(accountEntity.getAccNo());
            account.setAccountHolderName(accountEntity.getAccHolderName());
            account.setBalance(accountEntity.getBalance());
            account.setAccountType(accountEntity.getAccountType());
            account.setDateOfBirth(accountEntity.getDateOfBirth());
            account.setPsCode(accountEntity.getPsCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public boolean deleteAccount(int accountNo) {
        boolean deleteFlag = true;
        try {
            Session session = sessionFactory.getCurrentSession();
            AccountEntity accountEntity = session.load(AccountEntity.class, accountNo);
            session.delete(accountEntity);

        } catch (Exception e) {
            deleteFlag = false;
            e.printStackTrace();
        }
        return deleteFlag;
    }
}
