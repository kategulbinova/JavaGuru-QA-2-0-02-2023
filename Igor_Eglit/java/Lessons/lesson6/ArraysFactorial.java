package Lessons.lesson6;

class ArraysFactorial {
    public static void main(String[] args) {
        int finalFactorial = 10;
        int[] factorials = new int[finalFactorial];

        int result=1;
        for (int i = 0; i < factorials.length; i++) {
            result *= i+1;
            factorials[i] = result;
            System.out.println(factorials[i]);
        }
    }
}