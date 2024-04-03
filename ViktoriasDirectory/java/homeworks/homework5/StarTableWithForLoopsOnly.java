package homeworks.homework5;

public class StarTableWithForLoopsOnly {
    public static void main(String[] args) {
        // Define the number of rows and columns
        int rows = 8;
        int columns = 15;

        // Outer loop for rows (i - row counter)
        for (int i = 0; i < rows; i++) {
            // Inner loop for columns (j - column counter)
            for (int j = 0; j < columns; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
