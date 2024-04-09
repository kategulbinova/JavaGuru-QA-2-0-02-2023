package lesson7.MoneyMover;

public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.deposit(1000.00);
        myAcc.deposit(2500.00);
        myAcc.withdraw(12.56);
        myAcc.withdraw(124.50);
        myAcc.deposit(115.00);
        myAcc.withdraw(99.99);
        System.out.println( myAcc.checkBalance() );
    }
}
