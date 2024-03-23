/* HomeWork 4
* A small java program, which calculated and printed my dog age in human years.*/
package homeworks.homework4; //Class location. (automatically generated)

public class MyDogAge { //Create a new Java class. (Class name match the java file name (automatically generated))
    public static void main(String[] args) { //Runnable main() method. (Is required in every Java program).
        int myAge = 55; //Declare and initialize variable for my age.
        int dogAge = 13; //Declare and initialize variable for dog's age.
        int dogHumanYears = dogAge * 7; // Calculate dog's age in human years

        System.out.println("My age: " + myAge + " years"); // Print my age
        System.out.println("Dog's age: " + dogAge + " years"); // Print dog's age
        System.out.println("In human years, Dog is " + dogHumanYears + " years old"); // Print dog's age in human years

    } //method closing bracket
} //class closing bracket

/* With all this comments, code is almost unreadable ;), but that was the task:
// Add comment to each row, what is happening here
or how I understood them */