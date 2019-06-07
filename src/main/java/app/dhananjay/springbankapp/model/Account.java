package app.dhananjay.springbankapp.model;


import app.dhananjay.springbankapp.validations.PSCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Account {

    private Integer accountNo;

    @NotNull
    @Size(min=2,max=50,message="Invalid length for Account Holder Name")
    @Pattern(regexp="[A-Za-z(\\s)]+", message="Invalid Account Holder Name")
    private String  accountHolderName;

    @NotNull(message = "Balance amount is required.")
    @Min(value = 5000 , message = "min balance can not be less than 5000")
    private Integer balance;

    @NotNull(message = "Account type cant be null")
    private String accountType;

    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull(message="Date Of Birth cant be null")
    @Past(message="Account cant be created for a person not born")
    private Date dateOfBirth;

    @NotNull(message = "PS code is requried.")
    @PSCode(value = "DN", message = "PS Code should start with DN")
    private String psCode;

    public Account() {
        accountNo = 0;
        accountHolderName = "";
        balance = 0;
        accountType = "";
        dateOfBirth = new Date();
        psCode  = "";
    }

    public Account(Integer accNo, String holderName, Integer balance,
                   String accType, Date dob, String psCode
    ) {
        this.accountNo = accNo;
        this.accountHolderName = holderName;
        this.balance = balance;
        this.accountType = accType;
        this.dateOfBirth = dob;
        this.psCode = psCode;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPsCode() {
        return psCode;
    }

    public void setPsCode(String psCode) {
        this.psCode = psCode;
    }

}
