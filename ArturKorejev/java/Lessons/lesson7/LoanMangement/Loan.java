package Lessons.lesson7.LoanMangement;

public class Loan {

   double amount;
    String loanTaker;
    String bankName;
    int loanNumber;

    Loan() {
        this.amount = 0.0;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }

    Loan(double ammount) {
        this.amount = amount;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    String getLoanTakerName() {

        return this.loanTaker;
    };
    void acceptLoan() {
        System.out.println("This Loan has been issued succesfully");
        this.amount = amount;
    }

    void declineLoan() {
        System.out.println("This Loan has not been issued");
        amount = 0.0;
    }

    void changeBank(String newBankName) {
        this.bankName = newBankName;
    }


}
