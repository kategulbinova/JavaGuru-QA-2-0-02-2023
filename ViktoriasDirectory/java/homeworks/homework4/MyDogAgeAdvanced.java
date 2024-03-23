/* HomeWork 4
 * Advanced */
package homeworks.homework4;

import java.util.Scanner; //Import Scanner class

public class MyDogAgeAdvanced { //Create a new Java clas
    public static void main(String[] args) { //Runnable main method.
        int myAge = 55; // Declare and define my age

        System.out.print("Enter your dog's age in years: "); // Prompt user to enter dog's age
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        int dogAge = scanner.nextInt(); // Read user input for dog's age
        scanner.close(); // Close the Scanner object

        int dogHumanYears = dogAge * 7; // Calculate dog's age in human years

        System.out.println("My age: " + myAge + " years"); // Print your age
        System.out.println("Dog's age: " + dogAge + " years"); // Print dog's age
        System.out.println("In human years, Dog is " + dogHumanYears + " years old"); // Print dog's age in human years
    } //method closing bracket
} //class closing bracket
