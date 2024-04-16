package lesson5;

public class MyName {
    public static void main(String[] args){
        String firstName = "Anastasia";
        String lastName = "Shatohina";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName) );
        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName.concat(", ").concat(firstName) );

    }
}
