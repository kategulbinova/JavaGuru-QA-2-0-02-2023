package Lessons.lesson5;

public class BooleanShort {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println( !( (!x ^ x) && y) );

    }
}
