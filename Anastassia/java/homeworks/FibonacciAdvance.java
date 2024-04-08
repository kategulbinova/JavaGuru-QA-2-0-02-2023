package homeworks;

public class FibonacciAdvance {
    static void getFibonacciRow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < 2) array[i] = 1;
            else array[i] = array[i - 1] + array[i - 2];
        }
    }

    static void printFibonacciRow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static void modifyFibonacciRow(int[] array) {
       int increment =5;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + increment;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        getFibonacciRow(array);
        modifyFibonacciRow(array);
        printFibonacciRow(array);
    }
}
