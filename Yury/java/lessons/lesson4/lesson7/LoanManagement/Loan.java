package lessons.lesson4.lesson7.LoanManagement;

public class Loan {
    double amount;
    //Can be used as private in order to avoid mistakenly changing smth in the main program and use it via methods
    String loanTaker;
    String bankName;
    int loanNumber;

    Loan() {
        this.amount = 0.0;
        this.loanTaker = "NA";
        this.bankName = "NA";
        this.amount = 0;
    }
    Loan(double amount) {
        this.amount = amount;
        this.loanTaker = "NA";
        this.bankName = "NA";
        this.amount = 0;
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
        System.out.println("This loan has been issued successfully");
        this.amount = amount;
    }
    void declineLoan () {
        System.out.println("This application for loan was declined");
        amount = 0.0;
    }
    void changeBank(String newBankName) {
        this.bankName = newBankName;
    }
}
