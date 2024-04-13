package lesson7.MoneyMover;

public class BankAccount {
    double balance;
    void deposit(double amount) {
        System.out.println("Deposited: " + amount);
        this.balance = balance + amount;
    }

    void withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
        this.balance = balance - amount;
    }

    double checkBalance() {
        System.out.println("Current balance: " + this.balance);
        return this.balance;
    }
}
