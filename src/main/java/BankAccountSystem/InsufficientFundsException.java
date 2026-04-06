package BankAccountSystem;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(double balance, double requested) {
        super("Insufficient funds. Balance: " + balance
                + ", requested withdrawal: " + requested);
    }
}