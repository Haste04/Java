/* Haggai P. Estavilla  BSCS - 1A
   Date: March 19, 2024
   The purpose of this program is to ask the user for the number of items and the single-item heating time. The program then writes out the recommended heating time.
*/
import java.util.Scanner;
public class MicrowaveOvenHeatingTime 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        byte item;
        int time;
        int seconds = 0;
        int minutes = 0;

        System.out.printf("How many items to heat: "); //User Input how many items
        item = scan.nextByte();
        System.out.printf("Time for one item: "); //User Input time for one item
        time = scan.nextInt();
        
        if (item == 2) //If 2 items multiply by 50%; If 3 items multiply 2; Else stay as it is
            time = (int) ((double) time * 0.50 + time );
        else if (item == 3)
            time *= 2;
        else
            time *= 1;

        if (time > 100) //If the time is more than 100 then find the minute and seconds
        {
            seconds = time % 100; //Formula for seconds
            minutes = time / 100; //Formula for minutes
        }
       
        if (item == 1) //If there is 1 item 
            if (time > 100) //Nested if the time is more than 100
                System.out.printf("Heat for " + minutes + " minutes " + seconds + " seconds"); //Print Output
            else 
                System.out.printf("Heat for " + minutes + " minutes " + time + " seconds"); //Print Output
        else if (item == 2) //If there are 2 items 
        {
            if (time > 100) //Nested if the time is more than 100
                System.out.printf("Heat for " + minutes + " minutes " + seconds + " seconds"); //Print Output
            else
                System.out.printf("Heat for " + minutes + " minutes " + time + " seconds"); //Print Output
        }
        else if (item == 3) //If there are 3 items
        {
            if (time > 100) //Nested if the time is more than 100
            System.out.printf("Heat for " + minutes + " minutes " + seconds + " seconds"); //Print Output
            else
            System.out.printf("Heat for " + minutes + " minutes " + time + " seconds"); //Print Output
        }
        else if (item > 3) //If there are more than 3 items 
            System.out.printf("Heating more than 3 items at once is not recommended"); //Print Output
    }
}