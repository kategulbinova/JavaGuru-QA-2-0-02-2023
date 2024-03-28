package lessons.lesson5;

public class Concatenation {
    public static void main(String[] args) {

        String firstName = "Artur";
        String lastName  = "Korejev";

            System.out.println( firstName + " " + lastName );
            System.out.println( firstName .concat(" ").concat(lastName));
            System.out.println(lastName + ", " + firstName);
            System.out.println(lastName .concat(", ").concat(firstName));
    }

}
