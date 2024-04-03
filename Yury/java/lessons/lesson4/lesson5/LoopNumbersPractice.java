package lessons.lesson4.lesson5;

public class LoopNumbersPractice {
    public static void main(String[] args) {
        int a=0, Square, Cube;
        while (a<=20) {
            Square = a * a;
            Cube = a * a * a;
            System.out.println(a + " squared " + Square + " Cubed " + Cube);
            a++;
        }
    }
}
