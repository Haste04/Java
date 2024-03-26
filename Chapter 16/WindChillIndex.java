/* Haggai P. Estavilla  BSCS - 1A
   Date: March 5, 2024
   The purpose of this program is to calculate the wind chill index given the temperature and the wind speed
*/
import java.util.Scanner;
public class WindChillIndex
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      float v, temp; // v = wind speed, temp = temperature
      double windChill; //Local Declarations
      
      System.out.println("Enter Wind Speed:"); //User Input Wind Speed
      v = scan.nextFloat();
      System.out.println("Enter Temperature:"); //User Input Temperature
      temp = scan.nextFloat();
      
      if (v < 3) //If v is less than 3 then the wind chill is equal to the current temperature
         System.out.printf("Wind Chill: " + temp); //Print Output
      else if (temp > 50) //If the temperature is greater than 50 then the wind chill is equal to the current temperature
         System.out.printf("Wind Chill: " + temp); //Print Output
      else 
      {
         windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * temp * Math.pow(v, 0.16)); //Formula to get the wind chill
         System.out.printf("Wind Chill: " + windChill); //Print Output
      }
   }
}      