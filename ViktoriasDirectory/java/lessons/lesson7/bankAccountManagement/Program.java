package lessons.lesson7.bankAccountManagement;

public class Program {
    public static void main(String[] args) {
        BankAccount anAccount = new BankAccount();
        BankAccount fullAccount = new BankAccount(25000);
        BankAccount teacherAccount = new BankAccount("Jekaterina");
        BankAccount myFullAccount = new BankAccount(10000, "Viktoria");

        double balance = anAccount.checkBalance();
        System.out.println(anAccount.getAccountHolderName());

        balance = fullAccount.checkBalance();
        System.out.println(fullAccount.getAccountHolderName());

        balance = teacherAccount.checkBalance();
        System.out.println(teacherAccount.getAccountHolderName());

        System.out.println(myFullAccount.getAccountHolderName());
        double myBalance = myFullAccount.checkBalance();
        myFullAccount.deposit(100);
        myFullAccount.withdraw(150);
        myBalance = myFullAccount.checkBalance();
    }
}
