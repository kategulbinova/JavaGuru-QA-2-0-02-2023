package homework5;

public class StarsTable {
    public static void main(String[] args) {
        int rowNum=1, rows=8, columns=15, a=0;
        while (rowNum<=rows) {
            for (a=0; a<=columns; a++) {
                System.out.print("*");
            }
            rowNum++;
            System.out.println();
        }
    }
}
