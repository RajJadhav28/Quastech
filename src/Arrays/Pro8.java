package Arrays;
import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of rows
        System.out.print("Enter the number of rows for the jagged array: ");
        int rows = scanner.nextInt();
        
        // Create a jagged array with the specified number of rows
        int[][] arr = new int[rows][];
        
        // Loop through each row
        System.out.print("Enter the number of elements in row:");
        for (int i = 0; i < rows; i++) {
            // Ask for the number of columns in the current row
           
            int columns = scanner.nextInt();
            
            // Initialize the current row with the specified number of columns
            arr[i] = new int[columns];
            
            // Fill the current row with values
            System.out.print("Enter element of row " + (i + 1) + ": ");
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        
        // Print the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

