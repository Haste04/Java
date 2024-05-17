/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask the user to enter the time as a sequence of 
    digits and then displays the time as "minutes:seconds"
*/
import java.util.Scanner;
public class MicrowaveMenu 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        short numTime;
        String stringTime; //Local Declarations

        System.out.printf("Enter cook time -> "); //User Input time
        numTime = scan.nextShort();
        stringTime = String.valueOf(numTime);

        if (stringTime.length() <= 1)
            System.out.printf("Your time -> 0:0" + stringTime.substring(0)); //Output time
        else if (stringTime.length() == 2)
            System.out.printf("Your time -> 0:" + stringTime.substring(0)); //Output Time
        else 
            System.out.printf("Your time -> " + stringTime.substring(0, stringTime.length() - 2)+ ":" + stringTime.substring(stringTime.length() - 2));
    }
}