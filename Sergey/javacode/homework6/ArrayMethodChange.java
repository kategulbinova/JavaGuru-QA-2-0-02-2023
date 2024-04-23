package homework6;

public class ArrayMethodChange {
    public static void main(String[] args) {

        int n = 11;
        int[] fibonacciNumbers = new int[n];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }


        System.out.println("Original Fibonacci sequence:");
        printArray(fibonacciNumbers);

        increaseArrayElements(fibonacciNumbers, 5);

        System.out.println("Modified Fibonacci sequence (each element increased by 5):");
        printArray(fibonacciNumbers);
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void increaseArrayElements(int[] array, int increment) {
        for (int i = 0; i < array.length; i++) {
            array[i] += increment;
        }
    }
}


