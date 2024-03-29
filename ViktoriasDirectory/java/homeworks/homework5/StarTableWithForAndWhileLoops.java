package homeworks.homework5;

public class StarTableWithForAndWhileLoops {
    public static void main(String[] args) {
        int rows = 8; // Number of rows
        int columns = 15; // Number of columns

        int rowCount = 1; // Initialize row counter

        // Outer while loop for rows
        while (rowCount <= rows) {

            // Inner for loop for columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("* "); // Print one star followed by a space
            }

            System.out.println(); // Move to the next line after each row
            rowCount++; // Increment row counter
        }
    }
}
