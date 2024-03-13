package homework.homework4;

import java.util.Scanner; // class added for activation data input

public class catAge {

    private static Scanner input = new Scanner (System.in); // variable "input" added for data input
    public static void main(String[] args) {

        System.out.println("Enter your cat age to convert it to human ages:"); // visible information for user


        float catAge = input.nextFloat(); // waiting for data typing
        float humanAge = catAge * 7f; // calculating of cat age, variable "float" for decimal values


        System.out.print("Your cat is ");
        System.out.print(humanAge);
        System.out.println(" human years old"); // result

    }
}
