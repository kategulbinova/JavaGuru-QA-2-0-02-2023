package Lessons.lesson7.LoanMangement;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Test");

        int a;

        Loan myLoan = new Loan();

        myLoan.bankName = "Citadele";
        myLoan.loanTaker = "Artur";
        myLoan.amount = 1000000.0;
        myLoan.loanNumber = 123456;

        System.out.println(myLoan.amount);

        String person = myLoan.getLoanTakerName();
        myLoan.changeBank("Swedbank");

        System.out.println(myLoan.bankName);

        Loan loan4 = new Loan();
        loan4.bankName = "Krajbanka";
        loan4.amount = 150.0;
        loan4.loanTaker = "Igor";
        loan4.loanNumber = 98765;

        System.out.println("Viktorija's loan: " + myLoan.amount + "; Igor's loan: " + loan4.amount);

    Loan loan6 = new Loan(3200);
        System.out.println(loan6.amount);
    Loan loan7 = new Loan(5000);
    loan7.changeBank("Luminor");
    String personality = loan7.getLoanTakerName();

    loan7.setAmount(6000.0);
    }


}
