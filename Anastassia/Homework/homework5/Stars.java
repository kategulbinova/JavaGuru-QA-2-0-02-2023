package homeworks.homework5;

public class Stars {
    public static void main(String[] args) {
        int row = 8;
        int column = 15;
        for (int i=1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
};