/* Haggai P. Estavilla  BSCS - 1A
   Date: March 21, 2024
   The purpose of this program is to read in the pressure of the four tires and writes a message that says if the inflation is OK or not.
*/
import java.util.Scanner;
public class TirePressure 
{   
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        short RFrontPressure, LFrontPressure, RRearPressure, LRearPressure;

        System.out.println("Input right front pressure: "); //Input right front pressure of the tire
        RFrontPressure = scan.nextShort();
        System.out.println("Input left front pressure : "); //Input left front pressure of the tire
        LFrontPressure = scan.nextShort();
        System.out.println("Input right rear pressure : "); //Input right rear pressure of the tire
        RRearPressure = scan.nextShort();
        System.out.println("Input left rear pressure  : "); //Input left rear pressure of the tire
        LRearPressure = scan.nextShort();

        if (RFrontPressure == LFrontPressure && RRearPressure == LRearPressure) //If the pressure of the front tires are equal and the pressure of the rear tires are equal then inflation is ok otherwise it is not ok
            System.out.printf("Inflation is OK\n\n"); //Print Output
        else    
            System.out.printf("Inflation is not OK\n\n"); //Print Output
    }    
}