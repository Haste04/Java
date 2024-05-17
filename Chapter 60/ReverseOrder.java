/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to display the array in a reversed order
*/
public class ReverseOrder
{
  public static void main (String[] args)
  {
    int[] val = {0, 1, 2, 3}; 
    int[] temp = new int [4];
    int i, j = 3; //Local Declarations
 
    System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] ); //Print original array
 
    for (i = 0; i <= 3; i++) //Loop to get reverse order of array
    {
        temp[i] =  val[j];
        j--;
    }

    System.out.println( "Reversed Array: " + temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] ); //Print reversed order of array
   }
}
