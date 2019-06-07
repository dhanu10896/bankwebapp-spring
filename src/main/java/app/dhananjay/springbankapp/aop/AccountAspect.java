package app.dhananjay.springbankapp.aop;

import app.dhananjay.springbankapp.dao.AccountDAO;
import app.dhananjay.springbankapp.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(* app.dhananjay.springbankapp.dao.AccountDAOImpl.saveAccount(..))")
    public void validateAccount(JoinPoint joinPoint) {
        logger.info("Method : validateAccount is being processed");
        Object[] args = joinPoint.getArgs();
        Account account = (Account) args[0];
        AccountDAO accountDAO = (AccountDAO) joinPoint.getTarget();
        int accountNo  = account.getAccountNo();
        if (accountDAO.getAccount(accountNo) != null) {
            throw new RuntimeException("Account with Account Number " + accountNo + " is already exists");
        }
    }
}
