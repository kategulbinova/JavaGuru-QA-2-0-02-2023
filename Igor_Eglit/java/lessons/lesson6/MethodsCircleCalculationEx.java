package lessons.lesson6;

class MethodsCircleCalculationEx {
    static double calculateCirclePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    static double calculateCircleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    static int calculateDiameter(int radius) {
        return 2 * radius;
    }

    static double calculateVolumeOfSphere(int radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    static int roundTheNumber(double number) {
        return (int) Math.round(number);
    }

    public static void main(String[] args) {
        int radius = 5;
        System.out.println("The circle perimeter = " + roundTheNumber(calculateCirclePerimeter(radius)));
        System.out.println("The circle area = " + roundTheNumber(calculateCircleArea(radius)));
        System.out.println("The circle diameter = " + calculateDiameter(radius));
        System.out.println("The volume of the sphere = " + roundTheNumber(calculateVolumeOfSphere(radius)));
    }
}
