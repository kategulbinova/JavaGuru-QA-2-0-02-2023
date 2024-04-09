package lessons.lesson5;

public class StringPractice {
    public static void main(String[] args) {
        String firstName = "Igor";
        String lastName = "Eglit";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName.concat(", ").concat(firstName));

        String malePref = "Mr.";
        String femalePrefNotMarried = "Miss";
        String femalePrefMarried = "Mrs.";
        String maritalStatus = "Married";
        String gender = "Male";

        System.out.printf("%s: %s\n\t", "Marital status", maritalStatus);
        System.out.printf("%s: %s\n\t", "Gender", gender);
        System.out.printf("%s: %s\n\t", "First Name", firstName);
        System.out.printf("%s: %s\n\t", "Last Name", lastName);
        System.out.printf("%s\n", "-------------------------");
        System.out.printf("%s: %s %s %s\n\t", "Full Name", malePref, lastName, firstName);
    }

}
