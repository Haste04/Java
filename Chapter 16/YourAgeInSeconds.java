/*  Haggai P. Estavilla BSCS - 1A
    Date: March 7, 2024
    The purpose of this program is to ask the user for their age in years, months, and days and writes out their age in seconds.
    It also writes out what percentage of their expected lifespan they have lived.
*/
import java.util.Scanner;
import java.text.*; //Import Decimal Format
public class YourAgeInSeconds 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int days, months, years;
        long totalDays, seconds;
        double percentageLived; //Local Declarations
        long humanLifespan = 2500000000L; //Constant for human lifespan in seconds
        DecimalFormat df = new DecimalFormat ("#.##"); //Local Declaration for decimal format

        System.out.printf("Input your age in years : "); //User Input age in years
        years = scan.nextInt();
        System.out.printf("\nInput your age in months: "); //User Input age in months
        months = scan.nextInt();
        System.out.printf("\nInput your age in days  : "); //User Input age in days
        days = scan.nextInt();

        totalDays = years * 365; //Formula to get the total days in a year 

        if (months == 1) //If the month is 1 (January)
            totalDays = totalDays + 31;
        else if (months == 2) //If the month is 2 (February)
            totalDays = totalDays + 31 + 28;
        else if (months == 3) //If the month is 3 (March)
            totalDays = totalDays + 31 + 28 + 31;
        else if (months == 4) //If the month is 4 (April)
            totalDays = totalDays + 31 + 28 + 31 + 30;
        else if (months == 5) //If the month is 5 (May)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31;
        else if (months == 6) //If the month is 6 (June)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30;
        else if (months == 7) //If the month is 7 (July)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31;
        else if (months == 8) //If the month is 8 (August)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        else if (months == 9) //If the month is 9 (September)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        else if (months == 10) //If the month is 10 (October)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        else if (months == 11) //If the month is 11 (November)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 ;
        else if (months == 12) //If the month is 12 (December)
            totalDays = totalDays + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;

        totalDays += days; //Formula to get the remaining days
        seconds = totalDays * 24 * 60 * 60; //Formula to get the total seconds
        percentageLived = ((double) seconds / humanLifespan) * 100; //Formula to get the percentage that you lived of your expected lifespan
        
        System.out.printf("\nYour age in seconds is: " + seconds); //Print the total seconds 
        System.out.printf("\nYou have lived " + df.format(percentageLived) + "%% of your expected lifespan"); //Print the percentage
    }
}