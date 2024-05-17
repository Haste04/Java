/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to compute and print the largest element in each row
*/
import java.io.*;

public class LargestElements 
{
  public static void main (String[] args )  
{
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

    int maxCols = 0;

    for (int row = 0; row < data.length; row++) // Find the maximum number of columns across all rows
      maxCols = Math.max(maxCols, data[row].length);

    for (int row = 0; row < data.length; row++)  // Iterate through each row to find the largest element
    {
      int maxInRow = Integer.MIN_VALUE;  // Initialize with minimum possible value
      for (int col = 0; col < data[row].length; col++) 
        maxInRow = Math.max(maxInRow, data[row][col]);
      System.out.println("Largest element in row " + (row + 1) + ": " + maxInRow); //Print output
    }
  }
}