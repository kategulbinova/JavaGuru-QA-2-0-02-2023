package Lesson.Lesson5;

public class Concatenation {
    public static void main(String[] args) {

        String firstName = "Olga";
        String lastName  = "Morozova";

        System.out.println( firstName + " " + lastName );
        System.out.println( firstName .concat(" ").concat(lastName));
        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName .concat(", ").concat(firstName));
    }
}
