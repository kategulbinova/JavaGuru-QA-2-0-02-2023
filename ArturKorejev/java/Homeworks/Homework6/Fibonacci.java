package Homeworks.Homework6;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        int[] fibNum = new int[11];
            System.out.println(Arrays.toString(fibNum)); //Checked that array of integers holds 11 zeroes

        fibNum[0] = 1;
        fibNum[1] = 1;
        for (int i = 2; i < fibNum.length; i++) {

                fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
            }

            System.out.println(Arrays.toString(fibNum));
    }
}








