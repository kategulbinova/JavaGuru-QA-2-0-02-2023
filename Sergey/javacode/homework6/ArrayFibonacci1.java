package homework6;

public class ArrayFibonacci1 {
    public static void main(String[] args) {

            int n = 11;
            int[] fibonacciNumbers = new int[n];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;


            for (int i = 2; i < n; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }


            printArray(fibonacciNumbers);
        }


        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.println(num);
            }
        }
    }



