package stringManipulations;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print * for the first and last rows
                // Print * for the first and last columns
                // Print space for other positions
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
