package Lesson.Lesson5;

public class Booleans {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        boolean answer;

        boolean not_x = !x;
        boolean xor_x = not_x ^ x;
        boolean and_xy = xor_x && y;
        answer = !and_xy;

        System.out.println(answer);

    }
}
