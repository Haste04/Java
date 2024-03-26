/* Haggai P. Estavilla  BSCS - 1A
   Date: February 29, 2024
   The purpose of this program is to ask the user for the number of bolts, nuts, and washers in their purchase and then calculates and prints out the total. 
   As an added feature, the program checks the order. A correct order must have at least as many nuts as bolts and at least twice as many washers 
   as blots, otherwise the order has an error.
*/
import java.util.Scanner;
public class OrderChecker
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      final int boltPrice = 5;
      final int nutPrice = 3;
      final int washerPrice = 1;
      int bolt, nut, washer, total; //Local Declaration
      
      System.out.printf("Number of bolts : "); //User input bolt
      bolt = scan.nextInt();
      System.out.printf("Number of nuts  : "); //User input nut
      nut = scan.nextInt();
      System.out.printf("Number of washer: "); //User input washer
      washer = scan.nextInt();
      
      total = (bolt * boltPrice) + (nut * nutPrice) + (washer * washerPrice); //Formula for the total cost
      
      if (bolt == nut) //If the bolt is equal to the nut then true otherwise false
      { //True Branch
         if (washer >= (bolt * 2)) //If the washer is at least equal to the bolt then true otherwise false    
         { //True Branch
            System.out.printf("\nOrder is Ok\n");
            System.out.printf("\nTotal Cost: " + total); //Print the total cost
         }
         else
         { //False Branch
            System.out.printf("\nCheck the order: too few washers\n");
            System.out.printf("\nTotal Cost: " + total); //Print the total cost
         }
      }
      else 
      { //False Branch
         if (washer >= (bolt * 2)) //If the washer is at least equal to the bolt then true otherwise false
         { //True Branch
            System.out.printf("\nCheck the order: too few nuts\n");
            System.out.printf("\nTotal Cost: " + total); //Print the total cost
         }
         else
         { //False Branch
            System.out.printf("\nCheck the order: too few nuts");
            System.out.printf("\nCheck the order: too few washers\n");
            System.out.printf("\nTotal Cost: " + total); //Print the total cost
         }
      } 
   }
}