package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.BankException;
import pl.waw.sgh.bank.exceptions.InvalidSumException;
import pl.waw.sgh.bank.exceptions.NonExistantAccountException;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) { //throws NonExistantAccountException {
        Bank bank = new Bank();

        Customer c1 = bank.createCustomer("Anna", "Brown", "anna@ex.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@ex.com");

        Account acc1 = bank.createDebitAccount(c1);
        Account acc2 = bank.createSavingsAccount(c1);

        Account acc3 = bank.createDebitAccount(c2);
        Account acc4 = bank.createSavingsAccount(c2);

        System.out.println(bank);


        //System.err.println("My error message");

        try {
            Integer a = null;
            a = a + 1;
            acc1.deposit(252);
            acc2.deposit(300);
            acc2.charge(100);
            bank.transfer(1, 0, -80);
            System.out.println(bank);
            //} catch (NonExistantAccountException | InvalidSumException ne) {
        } catch (BankException ne) {
            System.out.println("Sth went wrong: " + ne.getMessage());
        }


    }
}