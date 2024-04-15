package lessons.lesson7.loan;

class Loan {
    private String borrower;
    private double amount;
    private double interestRate;
    private int term;

    Loan(){
        this.borrower = "Unknown";
        this.amount = 0;
        this.interestRate = 0;
        this.term = 0;
    }
    Loan(String borrower, double amount, double interestRate, int term) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getBorrower() {
        return borrower;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    public double getTotalAmount() {
        return amount + amount * interestRate * term;
    }
}
