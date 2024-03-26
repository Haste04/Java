/* Haggai P. Estavilla  BSCS - 1A
   Date: March 19, 2024
   The purpose of this program is to ask for the weight of a load of trash and then calculates the charge
*/
import java.util.Scanner;
public class TownDump 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        short trash;
        short charge;
        int additionalWeight;
        int additionalHundreds;

        System.out.printf("What is the weight of the load of the trash: "); //User input weight of the load of trash
        trash = scan.nextShort();

        if (trash <= 200) //If the trash is equal to or less than 200 then the charge is $20
            charge = 20;
        else
        {
            additionalWeight = trash - 200; //Formula to get the additional weight
            additionalHundreds = (int) Math.ceil(additionalWeight / 100); //Formula to get the rounded off value  
            charge = (short) (20 + additionalHundreds * 8); //Formula to get the total charge
        }
        System.out.printf("The charge for your inputted weight is: $" + charge); //Print the charge
    }
}