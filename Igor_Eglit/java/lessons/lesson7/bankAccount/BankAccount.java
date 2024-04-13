package lessons.lesson7.bankAccount;

class BankAccount {
    private int currentBalance;

    BankAccount() {
        currentBalance = 1_000;
    }

    void deposit(int amount) {
        currentBalance += amount;
        System.out.println("You have deposited " + amount + " euros");
    }

    void withdraw(int amount) {
        if (amount > currentBalance) {
            System.out.println("You don't have enough money on your account to withdraw " + amount + " euros");
            System.out.println("No money has been withdrawn");
            return;
        }
        currentBalance -= amount;
        System.out.println("You have withdrawn " + amount + " euros");
    }

    void checkBalance() {
        System.out.println("Your balance is " + currentBalance + " euros");

    }

}
