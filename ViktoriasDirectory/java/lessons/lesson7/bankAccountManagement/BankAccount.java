package lessons.lesson7.bankAccountManagement;

public class BankAccount {
    double currentBalance;

    void deposit(double anAmount){
        this.currentBalance = this.currentBalance + anAmount;
        System.out.println("You have deposited " + anAmount + " euros");
    }

    void withdraw(double anAmount){

        this.currentBalance = this.currentBalance - anAmount;
        System.out.println("You have withdrawn " + anAmount + " euros");
    }

    double checkBalance(){
        System.out.println("Your current balance is " + this.currentBalance + " euros");
        return this.currentBalance;
    }
}
