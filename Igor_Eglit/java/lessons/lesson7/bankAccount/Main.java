package lessons.lesson7.bankAccount;

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.checkBalance();
        account.deposit(100);
        account.withdraw(1200);
        account.withdraw(500);
        account.checkBalance();
    }
}
