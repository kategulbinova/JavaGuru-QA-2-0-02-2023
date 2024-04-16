package Lessons.lesson6;

public class ArrayNumbers {
    public static <string> void main(String[] args) {

        int[] numbers = {15, 23, 47, 51, -80, -99, -3, -222, 400, 0};
        int add = 5;

        for (int a = 0; a < numbers.length; a++) {
            System.out.print(numbers[a] + " ;");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + add;

        }
        for (int b = 0; b < numbers.length; b++) {
            System.out.print(numbers[b] + " ;");
        }
    }
}







