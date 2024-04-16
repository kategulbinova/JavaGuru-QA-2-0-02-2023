package lessons.lesson5;

public class BooleanPractice {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean result;
        result = !x;
        result = result ^ x;
        result = result && y;
        result = !result;
        System.out.println(result);
    }
}
