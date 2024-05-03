package lessons.lesson4.lesson7.LoanManagement.BankManagement;

public class BankAccount {

    double balance;
    double amount;
    double deposit;
    double withdraw;

    BankAccount(double balance) {
        this.balance = balance;
    }
    void toDeposit(double amount) {
        this.deposit = balance + amount;
        System.out.println("The amount deposited: " + amount);
    }
    void toWithdraw(double amount) {
        this.withdraw = balance - amount;
        System.out.println("You withdrawn money: "+ amount);
    }
    void checkBalance() {
        System.out.println("The current balance is " + (balance - this.withdraw + this.deposit));
    }
}
