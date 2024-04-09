package lessons.lesson7.bankAccountManagement;

public class Program {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(100);
        myAccount.withdraw(150);
        double myBalance = myAccount.checkBalance();

    }
}
