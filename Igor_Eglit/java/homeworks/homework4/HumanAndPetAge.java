package homeworks.homework4;

import java.util.Scanner;


class HumanAndPetAge {
    int humanAge;
    int petAge;

    public HumanAndPetAge() {
    }

    public static void main(String[] args) {

        HumanAndPetAge humanAndPetAge = scannerAge(); // create object and call method
        fieldValidation(humanAndPetAge); // call method and pass parameter to check if age is negative
        int petToHumanAge = petToHumanAgeCalculator(humanAndPetAge); // call method and assign result to variable
        humanPetAgeProcessingAndPrintResult(petToHumanAge, humanAndPetAge.humanAge);// call method and pass parameters
    }

    private static HumanAndPetAge scannerAge() {

        HumanAndPetAge humanAndPetAge = new HumanAndPetAge();
        Scanner scanner = new Scanner(System.in); // create object of Scanner
        System.out.print("Enter human age: "); // print message to console
        try {
            humanAndPetAge.humanAge = scanner.nextInt();
        } catch (Exception e) {// catch exception if age is not a number
            System.out.println("Age could be only number!");
            return scannerAge();// call method if age is not a number
        }
        System.out.print("Enter pet age: ");
        try {
            humanAndPetAge.petAge = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Age could be only number!");
            return scannerAge();
        }
        return humanAndPetAge;
    }

    private static void fieldValidation(HumanAndPetAge humanAndPetAge) {

        if (humanAndPetAge.humanAge <= 0 || humanAndPetAge.petAge <= 0 ) {// check if age is negative
            System.out.println("Age can't be negative or equal to 0!");
            System.exit(0);
        }
    }

    private static int petToHumanAgeCalculator(HumanAndPetAge humanAndPetAge) {
        return humanAndPetAge.petAge * 7; // calculate pet age in human years
    }

    private static void humanPetAgeProcessingAndPrintResult(int petToHumanAge, int humanAge) {
        if (petToHumanAge > humanAge) {
            System.out.println("Pet is older than human");
        } else if (petToHumanAge < humanAge) {
            System.out.println("Human is older than pet");
        } else {
            System.out.println("Human and pet are the same age");
        }
    }
}
