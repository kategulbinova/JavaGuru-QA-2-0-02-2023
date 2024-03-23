package lessons.lesson4;

public class CalculationsPractice {
    public static void main(String[] args) {
        int result;
        int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;
        result = (x - z) + y * y;
        System.out.println("Result1 = " + result);
        result = w/y + (x * z);
        System.out.println("Result2 = " + result);
        x = 2; y = 0; z = 4; w = 2;
        result = (x - z) + y * y;
        System.out.println("Result3 = " + ((x - z) + y * y ));
        System.out.println("Result4 = " + w/y + (x * z));
    }

}
