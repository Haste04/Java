/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to reverse the order of the elemets in each row of the matrix
*/
import java.io.*;

public class ReversalOfElementsInEachRow 
{
  static int[][] data = {{3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, 8},
                         {-1, -2, -3, 4, 5, 45},
                         {56},
                         {0, 1, 2, 3, 4, 5, 6, 7}}; //Data Array

  private static void printArray() //Print array
  {
    for (int row = 0; row < data.length; row++) 
    {
      for (int col = 0; col < data[row].length - 1; col++) 
        System.out.print(data[row][col] + ", ");
      System.out.println(data[row][data[row].length - 1]);
    }
  }
  public static void main(String[] args) 
  {
    // Print the initial array
    printArray();
    System.out.println();
    // Reverse each row
    for (int row = 0; row < data.length; row++) 
    {
      int left = 0;
      int right = data[row].length - 1;
      // Swap elements until left and right pointers meet or cross
      while (left < right) 
      {
        int temp = data[row][left];
        data[row][left] = data[row][right];
        data[row][right] = temp;
        left++;
        right--;
      }
    }
    // Print the reversed array
    printArray();
  }
}