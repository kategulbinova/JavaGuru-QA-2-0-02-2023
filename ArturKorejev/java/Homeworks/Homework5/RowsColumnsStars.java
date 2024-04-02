package Homeworks.Homework5;

public class RowsColumnsStars {
    public static void main(String[] args) {

        int rows;
        int qtyOfStars;

        rows = 8;
        qtyOfStars = 15;

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < qtyOfStars; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}