package BankAccountSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) throws InvalidAmountException {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // O funcționalitate specifică doar contului de economii
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied. New balance: $" + balance);
    }
}