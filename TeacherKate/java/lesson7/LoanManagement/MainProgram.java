package lesson7.LoanManagement;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Test");

        Loan loan7 = new Loan(5000.0, "Andrejs Buls", "Citadele banka", 234123);
        loan7.acceptLoan(3500.0);
        loan7.changeBank("Luminor");
        String personality = loan7.getLoanTakerName();

        loan7.setAmount(6000.0);
        double amt = loan7.getAmount();
        loan7.increaseLoanBy(350000.0);
        System.out.println(loan7.getAmount());

    }
}
