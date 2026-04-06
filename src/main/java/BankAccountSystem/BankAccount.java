package BankAccountSystem;

public class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("Account " + accountNumber + " created with balance: $" + balance);
    }
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! You tried to withdraw $" + amount + " but only have $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
    }
    public double getBalance() {
        return balance;
    }
}