package Lessons.lesson5;

public class Lesson5PracticeLoops {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 20){
            a++;
            System.out.print(a);
            System.out.print("   ");
            System.out.print(a*a);
            System.out.print("   ");
            System.out.println(a*a*a);
        }
        System.out.println("The End");

        for (int b = 0; b <= 20; b++) {
            System.out.print(b);
            System.out.print("   ");
            System.out.print(b*b);
            System.out.print("   ");
            System.out.println(b*b*b);

        }
        System.out.println("The End");

    }
}
