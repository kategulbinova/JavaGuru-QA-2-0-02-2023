package lessons.lesson7.loanManagement;

import lessons.lesson7.loanManagement.Loan;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Test");

        int a;

        Loan myLoan = new Loan(1000000, "Viktoria", 123456, "Industra");

        System.out.println(myLoan.getAmount());
        System.out.println(myLoan.getBankName());


        String person = myLoan.getLoanTakerName();
        myLoan.changeBank("Swedbank");

        System.out.println(person);
        System.out.println(myLoan.getBankName());

        Loan loan5 = new Loan();
        System.out.println(loan5.getBankName());

        Loan loan6 = new Loan(3200.0);
        System.out.println(loan6.getAmount());
    }
}
