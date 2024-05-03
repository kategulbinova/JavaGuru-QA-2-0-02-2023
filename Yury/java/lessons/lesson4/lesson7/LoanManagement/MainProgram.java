package lessons.lesson4.lesson7.LoanManagement;

public class MainProgram {
    public static void main(String[] args) {
        Loan myLoan = new Loan();
        myLoan.bankName = "Citadele";
        myLoan.loanTaker = "Yury";
        myLoan.amount = 100000000.0;
        myLoan.loanNumber = 738373873;

        System.out.println(myLoan.amount);
        String person = myLoan.getLoanTakerName();
        System.out.println(myLoan.bankName);
        myLoan.changeBank("Swedbank");

        System.out.println(myLoan.bankName);

        Loan loan4 = new Loan();
        loan4.bankName = "Krajbanka";
        loan4.loanTaker = "Jury";
        loan4.amount = 100000000.0;
        loan4.loanNumber = 1757939373;

        System.out.println("Yury's loan: " + myLoan.amount + "Jury's loan: " + loan4.amount);

        Loan loan5 = new Loan();
        System.out.println(loan5.bankName);

        Loan loan6 = new Loan(222222233.0);
        System.out.println(loan6.amount);
    }
}
