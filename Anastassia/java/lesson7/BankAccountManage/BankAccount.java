package lesson7.BankAccountManage;

public class BankAccount {
    double balance;
    int amount;
    void deposit(int amount){
        this.balance = balance + amount;
        System.out.println("You have deposited" + amount);
    }

    void withdraw() {
        System.out.println("You have withdrawn 1000 euros ");
    }

    void checkBalance(double balance){
        System.out.println("Your current balance is 1000 000 euros ");
    }
}
