/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to compute the sums of the elements in each row 
*/
import java.io.* ;
public class RowSums
{
  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} }; //Array Data
    
    // compute the sums for each row
    for (int row=0; row < data.length; row++)
    {
      // initialize the sum
        int sum = 0;
      // compute the sum for this row
        for (int col=0; col < data[row].length; col++) 
            sum += data[row][col];
      // write the sum for this row
        System.out.println("Sum of elements in row " + (row + 1) + ": " + sum);
    }
  }
}      