import java.util.Scanner;
import java.text.*;
public class JetLagCalculator 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double daysOfRecovery;
        byte hours, timeZones, departureTime, departure, arrivalTime, arrival;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("Input the number of hours of travel: ");
        hours = scan.nextByte();
        System.out.printf("Input the number of time zones crossed: ");
        timeZones = scan.nextByte();
        System.out.printf("Input the departure time: ");
        departureTime = scan.nextByte();
        System.out.printf("Input the arrival time: ");
        arrivalTime = scan.nextByte();

        if (departureTime >= 800 && departureTime < 1200)
            departure = 0;
        else if (departureTime >= 1200 && departureTime < 1800) 
            departure = 1;
        else if (departureTime >= 1800 && departureTime < 2200) 
            departure = 3;
        else if (departureTime >= 2200 || departureTime < 100) 
            departure = 4;
        else 
            departure = 5;
           
        if (arrivalTime >= 800 && arrivalTime < 1200) 
            arrival = 4;
        else if (arrivalTime >= 1200 && arrivalTime < 1800) 
            arrival = 2;
        else if (arrivalTime >= 1800 && arrivalTime < 2200) 
            arrival = 0;
        else if (arrivalTime >= 2200 || arrivalTime < 100) 
            arrival = 1;
        else 
            arrival = 3;

        daysOfRecovery = (hours / 2.0 + (timeZones - 3) + departure + arrival) / 10.0;
        System.out.printf("The number of days you need to recover is: " + df.format(daysOfRecovery) + " days");
    }
}
