/* Haggai P. Estavilla  BSCS - 1A
   Date: March 14, 2024
   The purpose of this program is to asks the user for the air temperature and the steam temperature and writes out the maximum possible efficiency of a steam engine.  
*/
import java.util.Scanner;
public class SteamEngineEfficiency 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        int Tair, Tsteam;
        float efficiency;

        System.out.printf("Please enter the air temperature  : "); //User Input air temperature
        Tair = scan.nextInt();
        System.out.printf("Please enter the steam temperature: "); //User Input steam temperature
        Tsteam = scan.nextInt();

        efficiency =  1 - ((float) Tair / Tsteam); //Formula to get efficiency

        if (Tsteam > 373) //If the steam temperature is greater than 373 Kelvin
            System.out.printf("\nThe efficiency is " + efficiency); //Print Output
        else //If the steam temperature is less than 373 Kelvin then the efficiency is 0
            System.out.printf("\nThe efficiency is zero"); //Print Output
    }
}