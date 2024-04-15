package lessons.lesson7.loan;

class Printer {

    public void printLoanInfo(Loan loan) {
        System.out.println("Borrower: " + loan.getBorrower());
        System.out.println("Amount: " + loan.getAmount());
        System.out.println("Interest rate: " + loan.getInterestRate());
        System.out.println("Term: " + loan.getTerm());
        System.out.println("Total amount: " + loan.getTotalAmount());
    }

    public void printAccepted() {
        System.out.println("The loan has been accepted.");
    }

    public void printRejected() {
        System.out.println("The loan has been rejected.");
    }

}
