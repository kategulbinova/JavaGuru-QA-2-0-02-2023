package Lessons.lesson5;

public class Lesson5PracticeBoolean {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;

        boolean z = !x;
        z = z ^= x;
        z = z&&y;
        z = !z;
        // z = !( ( !x ^ x) && y );
        System.out.println(z);

    }
}
