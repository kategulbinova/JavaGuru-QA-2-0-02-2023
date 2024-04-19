package lessons.lesson4.lesson6;

public class CalculateCircumference {
    static double calculateCircumference (double radius) {
        // The method should have the name as action and we give parameter to the input, that we are going to insert in order to receive the outcome
        double circleCircumference = 2 * Math.PI * radius;
        return circleCircumference;
    }

    public static void main(String[] args) {
        System.out.println("Circle circumference is " + calculateCircumference(8));
    }
}
