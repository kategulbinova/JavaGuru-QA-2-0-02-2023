package Lessons.lesson5;

public class LoopPractice {
    public static void main(String[] args) {
        System.out.printf("  %s  %s  %s\n\t", "Number", "Square", "Cube");
        System.out.printf("%s\n\t", "------------------");
        int a = 0;
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.printf("%d     %d     %d\n\t", a, a * a, a * a * a);
            }
            a++;
        }
        System.out.println();
        System.out.printf("%s  %s  %s\n\t", "Number", "Square", "Cube");
        System.out.printf("%s\n\t", "------------------");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d     %d     %d\n\t", i, i * i, i * i * i);
            }
        }
    }
}
