package Lessons.lesson5;

public class Lesson5PracticeStringConcat {
    public static void main(String[] args) {
        String myName = "Viktoria";
        String mySurname = "Galinkina";
        System.out.println(myName + " " + mySurname);
        System.out.println(myName.concat(" ").concat(mySurname));
        System.out.println(mySurname + ", " + myName);
        System.out.println(mySurname.concat(", " + myName));
    }
}
