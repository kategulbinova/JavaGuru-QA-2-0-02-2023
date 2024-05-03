package lessons.lesson4.lesson7.LoanManagement.BankManagement;

public class MainProgram {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(0.0);
        myBankAccount.toDeposit(60.0);
        myBankAccount.toWithdraw(50.0);
        myBankAccount.checkBalance();

    }
}
