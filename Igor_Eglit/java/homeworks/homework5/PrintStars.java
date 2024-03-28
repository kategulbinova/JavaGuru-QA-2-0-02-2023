package homeworks.homework5;

public class PrintStars {
    public static void main(String[] args) {
        int columns = 16;
        int rows = 6;
        toPrintStars(rows, columns);
    }

    private static void toPrintStars(int linesQuantity, int starsInTheLine) {
        for (int i = 0; i < linesQuantity; i++) {
            for (int j = 0; j < starsInTheLine; j++) {
                System.out.print(j % 2 == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
