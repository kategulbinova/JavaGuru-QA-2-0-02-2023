package Homeworks.Homework6;



public class Fibonacci {
    static void fibonacciCalc(int[] fibNum) {
        fibNum[0] = 1;
        fibNum[1] = 1;
        for (int i = 2; i < fibNum.length; i++) {
            fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
            }

    }
    static void printArray(int[] array){
        for (int j : array)
            System.out.print(j + "; ");

    }
    public static void main(String[] args) {
        int[] fibonacciNumbers = new int[11];
        fibonacciCalc(fibonacciNumbers);
        printArray(fibonacciNumbers);
    }
}








