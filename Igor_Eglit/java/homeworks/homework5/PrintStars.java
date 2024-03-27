package homeworks.homework5;

public class PrintStars {
    public static void main(String[] args) {
        int starsInTheLine = 16;
        int linesQuantity = 8;
        toPrintStars(linesQuantity, starsInTheLine);
    }
    private static void toPrintStars(int linesQuantity, int starsInTheLine) {
        for (int i = 0; i < linesQuantity; i++) {
            for (int j = 0; j < starsInTheLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
