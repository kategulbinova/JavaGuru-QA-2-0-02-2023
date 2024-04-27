package lesson7.LoanMagagement;

public class Loan {
    private double amount;
   private String loanTaker;
   private String bankName;
   private int loanNumber;

    Loan(){
        this.amount = 0.0;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }
    Loan(double amount){
        this.amount = amount;
        this.amount = 0.0;
        this.loanTaker = "N/A";
        this.bankName = "N/A";
        this.loanNumber = 0;
    }
    Loan(double amount, String person) {
        this.amount = amount;
        this.amount = 0.0;
        this.loanTaker = person;
        this.bankName = "N/A";
        this.loanNumber = 0;
    }
    Loan (double amount, String person, String bank, int loanNumber) {

    }

    public double getAmount() { //getter method
        return amount;
    }

    public void setAmount(double amount) { //setter method
        this.amount = amount;
    }

    String getLoanTakerName() {
        return this.loanTaker;
    }
    void acceptLoan(double amount){
        System.out.println("Loan is issued");
        this.amount = amount;
    }

    void increaseLoanBy(double amount) {
       amount =  this.amount + amount;
    }
    void declineLoan() {
        System.out.println("Loan is declined");
        amount = 0.0;
    }
        void changeBank(String newBankName) {
            this.bankName = newBankName;
        }

}
