/*  Haggai P. Estavilla BSCS - 1A 
    Date: March 5, 2024
    The purpose of this program is to help drivers decide if they need gas.
*/
import java.util.Scanner;
public class LastChanceGas 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner (System.in);
    int gas, tankCapacity, gageReading, milesPerGallon;
    float percentGage; //Local Declaration

    System.out.println("Tank Capacity:"); //User Input Tank Capacity
    tankCapacity = scan.nextInt();
    System.out.println("Gage reading:"); //User Input Gage Reading
    gageReading = scan.nextInt();
    System.out.println("Miles per gallon:"); //User Input Miles per gallon
    milesPerGallon = scan.nextInt();

    percentGage = gageReading / 100.0f; //Formula to convert int percent to floating point decimal
    gas = (int) (((float) tankCapacity * percentGage) * milesPerGallon); //Formula to get the gas remaining

    if (gas >= 200) // If the car can cross 200 miles then true otherwise false
        System.out.println("Safe to Proceed");
    else
        System.out.println("Get Gas!");
    }
}