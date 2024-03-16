package homework.homework4;

import java.util.Scanner; // class added for activation data input

public class catAge {

    private static Scanner input = new Scanner (System.in); // Class "scanner" added for data input
    public static void main(String[] args) {

        System.out.println("Enter your cat age to convert it to human ages:"); // Visible information for user

        float catAge = input.nextFloat(); // Waiting for data typing
        float humanAge = catAge * 7f; // Calculating of cat age, variable "float" for decimal values

        System.out.print("Your cat is ");
        System.out.print(humanAge);
        System.out.println(" human years old"); // result


    }
}