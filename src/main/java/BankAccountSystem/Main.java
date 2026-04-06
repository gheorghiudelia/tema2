package BankAccountSystem;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Testing normal operations ");
        try {
            BankAccount account1 = new BankAccount("RO12345", 1000);
            account1.deposit(500);
            account1.withdraw(200);
            SavingsAccount savings = new SavingsAccount("RO98765", 2000, 5.0);
            savings.applyInterest();
            System.out.println("\n Testing exceptions ");
            savings.withdraw(5000);

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(" Error caught: " + e.getMessage());
        }
        try {
            System.out.println("\n Testing Invalid Deposit ");
            BankAccount account2 = new BankAccount("RO00000", 500);
            account2.deposit(-100);

        } catch (InvalidAmountException e) {
            System.out.println(" Error caught: " + e.getMessage());
        }
    }
}