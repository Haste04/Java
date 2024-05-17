/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to compute and print the sum of each column of the array
*/
import java.io.*;

public class SumOfEachColumn 
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    int maxCols = 0; // Find the maximum number of columns across all rows

    for (int row = 0; row < data.length; row++) 
      maxCols = Math.max(maxCols, data[row].length);
  
    int[] columnSums = new int[maxCols]; // Initialize a list to store column sums 
    for (int row = 0; row < data.length; row++)  // Iterate through the data, adding elements to their corresponding column sum
    {
      for (int col = 0; col < data[row].length; col++) 
        columnSums[col] += data[row][col];
    }

    System.out.println("Sum of elements in each column:"); //Print the sums of columns
    for (int col = 0; col < columnSums.length; col++)
      System.out.println("Column " + (col + 1) + ": " + columnSums[col]);
  }
}