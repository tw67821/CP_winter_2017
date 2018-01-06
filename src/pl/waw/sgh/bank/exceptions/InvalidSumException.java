package pl.waw.sgh.bank.exceptions;

public class InvalidSumException extends BankException {
    public InvalidSumException(String s) {
        super(s);
    }
}