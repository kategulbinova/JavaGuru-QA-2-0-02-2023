package lesson6;

public class CircleCalculations {

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculateDiameter(double radius) {
        return 2 * radius;
    }
    public static void main(String[] args) {
        double radius = 3.8;
        System.out.println( "Circumference for this circle is: " + calculateCircumference(radius) + " cm");
    }
}
