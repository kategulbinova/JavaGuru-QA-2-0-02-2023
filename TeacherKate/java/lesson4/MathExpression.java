package lesson4;

public class MathExpression {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        int z = 10;
        int w = -2;

        int answer = (x + y) - z / w;
        System.out.println(answer);

        System.out.println( x / w + y * y - x);
    }
}
