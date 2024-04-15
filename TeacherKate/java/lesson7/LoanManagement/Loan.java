package lesson7.LoanManagement;

public class Loan {
    private double amount;
    private String loanTaker;
    private String bankName;
    private int loanNumber;

    Loan() {
        this.amount = 0.0;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }

    Loan(double amount) {
        this.amount = amount;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }

    Loan(double amount, String person) {
        this.amount = amount;
        this.loanTaker = person;
        this.bankName = "N/A";
        this.loanNumber = 0;
    }

    Loan(double amount, String person, String bank, int loanNumber) {
        this.amount = amount;
        this.loanTaker = person;
        this.bankName = bank;
        this.loanNumber = loanNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    String getLoanTakerName() {
        return this.loanTaker;
    }

    void acceptLoan(double amount) {
        System.out.println("This loan has been issued successfully!");
        this.amount = amount;
    }

    void increaseLoanBy(double amount) {
        this.amount = this.amount + amount;
    }

    void declineLoan() {
        System.out.println("This loan has not been issued!");
        amount = 0.0;
    }

    void changeBank(String newBankName) {
        this.bankName = newBankName;
    }

}
