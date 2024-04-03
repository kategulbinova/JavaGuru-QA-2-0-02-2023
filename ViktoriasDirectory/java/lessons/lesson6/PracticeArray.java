package lessons.lesson6;

public class PracticeArray {
    static int calculateFactorial(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 11, -12, 16, 14, -17, 6, 10};
        int add =5;
        for (int j : numbers) {
            System.out.print(j + "; ");
        }
         System.out.println();
        for (int j : numbers) {
            System.out.print(j + add + "; ");
        }
        System.out.println();
        for (int j : numbers) {
            System.out.print(calculateFactorial(j) + "; ");
        }
    }
}
