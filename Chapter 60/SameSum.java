/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to put values into valB so that the sum of corresponding cells in valA and valB is 25
*/
public class SameSum
{
    public static void main ( String[] args )
    {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = { 0,   0,   0,  0};
        int i; //Local Declarations

        for (i = 0; i < valA.length; i++) //Loop to get values into valB so that the sum of corresponding cells is 25
            valB[i] = 25 - valA[i];
    
        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] ); //Print elements of valA
        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] ); //Print elements of valB
        System.out.println( "sum:  " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) ); //Print sum of the corresponding cells
   }
}