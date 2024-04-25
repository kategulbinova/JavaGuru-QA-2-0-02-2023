package homework6;

public class FibonacciRow {
    static void calculateFibNum (int[] arr) {
        arr[0] = 1;
        arr[1] = 1;
        //initialise and declare first 2 indexes (positions) in the array
        for (int i=2; i <arr.length; i++) {
            // count start from 2 since we have already dec\in 2 first values for the fib number
            arr[i] = arr[i-2] + arr[i-1];
            // the current i is the amount of 2 previous combined
        }
    }
    static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]);
            //creating a count for an array
    }
    }
    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        calculateFibNum(array);
        printArray(array);
    }
}
