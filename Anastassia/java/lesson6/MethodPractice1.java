package lesson6;

public class MethodPractice1 {
   static double calcCircleCircumference(double radius){
       return 2*Math.PI*radius;
   }
    static double calcCircleArea(double radius){
       double circleArea = Math.PI*radius*radius;
       return  circleArea;
    }
    static double calcCircleDiam(double radius){
        double diameter = radius*2;
        return  diameter;
    }
    public static void main(String[] args) {
       double radius = 3.0;
       System.out.println("Circumference is "+ calcCircleCircumference(radius) + " cm");
       System.out.println("Circle area is "+ calcCircleArea(radius) + " cm");
       System.out.println("Circle diameter is " + calcCircleDiam(radius) + " cm");
    }
}
