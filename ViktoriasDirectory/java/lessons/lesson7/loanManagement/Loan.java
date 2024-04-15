package lessons.lesson7.loanManagement;

public class Loan {
    private double amount;
    private String bankName;
    private String loanTaker;
    private int loanNumber;

    Loan(){
        this.amount = 0.0;
        this.loanTaker = "N/A";
        this.loanNumber = 0;
        this.bankName = "N/A";
    }

    Loan(double amount){
        this.amount = amount;
        this.loanTaker = "N/A";
        this.loanNumber = 0;
        this.bankName = "N/A";
    }
    Loan(double amount, String person){
        this.amount = amount;
        this.loanTaker = person;
        this.loanNumber = 0;
        this.bankName = "N/A";
    }
    Loan(double amount, String person, int loanNumber){
        this.amount = amount;
        this.loanTaker = person;
        this.loanNumber = loanNumber;
        this.bankName = "N/A";
    }
    Loan(double amount, String person, int loanNumber, String bankName){
        this.amount = amount;
        this.loanTaker = person;
        this.loanNumber = loanNumber;
        this.bankName = bankName;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getLoanTaker() {
        return loanTaker;
    }

    public void setLoanTaker(String loanTaker) {
        this.loanTaker = loanTaker;
    }

    String getLoanTakerName(){
        return this.loanTaker;
    }
    void acceptLoan(double amount){
        System.out.println("This loan has been issued successfully!");
        this.amount = amount;
    }
    void declineLoan(){
        System.out.println("This loan has been declined");
        this.amount = 0.0;
    }
    void changeBank(String newBankName){
        this.bankName = newBankName;

    }
}
