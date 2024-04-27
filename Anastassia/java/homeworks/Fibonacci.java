package homeworks;

import java.util.Arrays;

public class Fibonacci {
    static int[] getFibonacciRow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < 2) array[i] = 1;
            else array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static void printRow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        getFibonacciRow(array);
        printRow(array);
    }
}
