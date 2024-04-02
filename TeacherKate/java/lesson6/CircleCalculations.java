package lesson6;

public class CircleCalculations {

    static double calculateCircumference(double radius) {
        double result = 2 * 3.14 * radius;
        return result;
    }

    public static void main(String[] args) {
        System.out.println( "Circumference for this circle is: " + calculateCircumference(3.8) + " cm");
    }
}
