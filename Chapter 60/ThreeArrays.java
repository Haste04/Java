/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to compute the sum of the corresponding cells in valA abd valB.
*/
public class ThreeArrays
{
  public static void main (String[] args )
  {
    int[] valA   = { 13, -22, 82, 17}; 
    int[] valB   = {-12, 24, -79, -13};
    int[] sum    = { 0, 0, 0, 0};
    int i; //Local Declarations
    
    for (i = 0; i < sum.length; i++) //Loop to get the sum of the corresponding cells
        sum[i] = valA[i] + valB[i]; //Formula to get sum

    System.out.println("Sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] ); //Print the sum
   }
}