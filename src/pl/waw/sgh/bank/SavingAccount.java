package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class SavingAccount extends Account {

    public SavingAccount(Integer accountID, BigDecimal balance, Customer customer) {
        super(accountID, balance, customer);
    }

    public SavingAccount(Integer accountID, double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
