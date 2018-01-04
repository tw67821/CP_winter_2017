package pl.waw.sgh.bank;

import org.omg.CORBA.DynAnyPackage.Invalid;
import pl.waw.sgh.bank.exceptions.InvalidSumException;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;

    private BigDecimal balance;

    private Customer customer;

    public void deposit(double amount) throws InvalidSumException {
        checkAmount(amount);
            balance = balance.add(new BigDecimal(amount));

    }

    private void checkAmount(double amount) throws InvalidSumException{
    if (amount <= 0)
            throw new InvalidSumException("You cannot charge a negative amount");}

            public void charge(double amount) throws InvalidSumException {
                checkAmount(amount);
            balance = balance.subtract(new BigDecimal(amount));


        }




    public Account(Integer accountID, BigDecimal balance, Customer customer) {
        this.accountID = accountID;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(Integer accountID, Double balance, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.customer = customer;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Account", "") +
                "{" +
                "ID=" + accountID +
                ", USD=" + balance +
                ", cust=" + customer.getCustomerID() +
                "}\n";
    }
}