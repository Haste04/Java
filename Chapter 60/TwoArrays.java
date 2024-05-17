/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to print out the twice the value of the original array
*/
public class TwoArrays 
{
    public static void main (String[] args)
    {
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int [4];
        int i; //Local Delcarations
     
        for (i = 0; i < val.length; i++) //Loop to get the double value of the original array
            twice[i] = val[i] * 2;  
            
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] ); //Print original array
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] ); //Print the twice value array
    }
}