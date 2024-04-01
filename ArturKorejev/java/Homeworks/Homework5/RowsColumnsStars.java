package Homeworks.Homework5;

public class RowsColumnsStars {
    public static void main(String[] args) {
        for (int a = 0; a < 8; a++) {          //Rows
            for (int b = 0; b < 15; b++) {     //Qty of stars in each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}