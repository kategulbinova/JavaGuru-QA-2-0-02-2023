package lessons.lesson6;

public class CircleCalculation {
    static double calcCircleCircumference(double radius){ return  2 * Math.PI * radius; }
    static double calcCircleArea(double radius){ return Math.PI * radius * radius;}
    static double calcCircleDiameter( double radius ){ return radius * 2; }
    static double calcBallVolume(double radius){ return 4/3 * Math.PI * radius * radius * radius; }

    public static void main(String[] args) {
        double radius = 4.5;
        System.out.println("Circumference for circle with radius: " + radius + " is: " + calcCircleCircumference(radius) + " cm.");
        System.out.println("Area for circle with radius: " + radius + " is: " + calcCircleArea(radius) + " cm2.");
        System.out.println("Diameter for circle with radius: " + radius + " is: " + calcCircleDiameter(radius) + " cm.");
        System.out.println("Volume for ball with radius: " + radius + " is: " + calcBallVolume(radius) + " cm2.");
    }
}
