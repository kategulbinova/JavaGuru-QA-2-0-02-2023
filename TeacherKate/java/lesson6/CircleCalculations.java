package lesson6;

public class CircleCalculations {

    static double calculateCircumference(double radius) {
        double result = 2 * Math.PI * radius;
        return result;
    }

    public static void main(String[] args) {
        double radius = 3.8;
        System.out.println( "Circumference for this circle is: " + calculateCircumference(radius) + " cm");
    }
}
