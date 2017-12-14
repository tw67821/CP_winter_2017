package pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;

    private BigDecimal balance;

    private Customer customer;

    public Account(Integer accountID, BigDecimal balance, Customer customer) {
        this.accountID = accountID;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(Integer accountID, double balance, Customer customer) {
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
        return "Account{" +
                "accountID=" + accountID +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }

}
