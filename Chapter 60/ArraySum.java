/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to compute the sum of all the numbers in the array
*/
public class ArraySum 
{
    public static void main (String[] args ) 
    {
      int[] value = {0, 1, 2, 3}; 
      int sum = 0; //Local Declarations

      for (int i = 0; i < value.length; i++) //Loop to get the sum of all numbers 
        sum += value[i];
      System.out.println("Sum of all numbers = " + sum); //Print sum
    }
  }