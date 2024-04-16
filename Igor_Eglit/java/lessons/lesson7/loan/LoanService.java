package lessons.lesson7.loan;

class LoanService {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Loan loan = new Loan();
        printer.printLoanInfo(loan);
        System.out.println();

        loan.setBorrower("John");
        loan.setAmount(1000);
        loan.setInterestRate(0.01);
        loan.setTerm(12);

        printer.printLoanInfo(loan);
        printer.printAccepted();
        System.out.println();

        Loan loan2 = new Loan();
        loan2.setBorrower("Jane");
        loan2.setAmount(2000);
        loan2.setInterestRate(0.015);
        loan2.setTerm(24);

        printer.printLoanInfo(loan2);
        printer.printRejected();
        System.out.println();

        Loan loan3 = new Loan("Jack", 3000, 0.02, 36);
        printer.printLoanInfo(loan3);
        printer.printAccepted();
    }
}
