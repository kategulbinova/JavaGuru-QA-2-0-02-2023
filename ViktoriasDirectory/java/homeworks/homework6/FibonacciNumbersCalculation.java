package homeworks.homework6;

public class FibonacciNumbersCalculation {
    static void calcFibonacciNumbers(int[] arr){
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++)
            arr[i] = arr[i-1] + arr[i-2];
    }
    static void printArray(int[] arr){
        for (int num : arr)
            System.out.print(num + "; ");
    }
    public static void main(String[] args) {
        int[] fibonacciArray = new int[11];
        calcFibonacciNumbers(fibonacciArray);
        System.out.println("First 11 Fibonacci numbers:");
        printArray(fibonacciArray);
     }
}
