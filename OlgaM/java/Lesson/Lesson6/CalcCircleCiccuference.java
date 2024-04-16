package Lesson.Lesson6;

public class CalcCircleCiccuference {

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 3.8;
        System.out.println( "Circumference for this circle is: " + calculateCircumference(radius) + " cm");
    }
}
//Circumference for this circle is: 23.876104167282428 cm