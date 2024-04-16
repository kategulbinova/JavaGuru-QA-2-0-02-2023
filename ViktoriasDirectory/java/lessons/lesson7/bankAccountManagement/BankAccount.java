package lessons.lesson7.bankAccountManagement;
public class BankAccount {
    private double currentBalance;
    private String accountHolderName;
    BankAccount(){
        this.currentBalance = 0.0;
    }
    BankAccount(double anAmount){
        this.currentBalance = anAmount;
    }
    BankAccount(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    BankAccount(double anAmount, String accountHolderName){
        this.currentBalance = anAmount;
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
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
