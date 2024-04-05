package Homeworks.Homework6;

public class Fibonacci {
    public static void main(String[] args) {

        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int sum, f1 = 0, f2 = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum = f1 + f2;
            f2 = f1;
            f1 = sum;
            System.out.print(sum + " ");


            //use method «printArray(int[] arr) { … }»
            //inside the method use «for» loop to print each element of an array



        }
    }
}



