package lesson7.LoanMagagement;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Test");
        
      //  Loan myLoan = new Loan(); //new object myLoan of type Loan
       // myLoan.bankName = "LHV";
      //  myLoan.loanTaker = "Anastassia";
      //  myLoan.amount = 1000.0;
      //  myLoan.loanNumber = 12345;

     //   System.out.println(myLoan.amount);

      //  String person = myLoan.getLoanTakerName();
      //  myLoan.changeBank ( "Swedbank");
      //  System.out.println(myLoan.bankName);

      //  Loan loan4 = new Loan();
      //  loan4.bankName = "SEB";
      //  loan4.amount = 150.0;
      //  loan4.loanTaker = "Igor";
      //  loan4.loanNumber = 1434324;

      //  Loan loan5 = new Loan();
     //   System.out.println(myLoan.bankName);

       // Loan loan6 = new Loan (3200.0);
      //  System.out.println(loan6.amount);

        Loan loan7 = new Loan (3200.0, "Andrei", "LHV", 2637443);
        loan7.acceptLoan(3500.0);
        loan7.changeBank("Luminor");
        String personality = loan7.getLoanTakerName();

        loan7.setAmount(6000.0);
        double amt = loan7.getAmount();
        loan7.increaseLoanBy(350000.0);
        System.out.println(loan7.getAmount());
    }
}
