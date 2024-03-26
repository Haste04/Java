/* Haggai P. Estavilla  BSCS - 1A
   Date: March 5, 2024
   The purpose of this program is to calculate the cost per pound of lean 
   (non-fat) beef for each package and writes out which is the best value.
*/

import java.util.Scanner;
public class GroundBeefValueCalculator
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      float priceA, priceB, costPoundA, costPoundB;
      int leanA, leanB; //Local Declarations
      
      System.out.println("Price per pound package A:"); //User Input price per pound of package A
      priceA = scan.nextFloat();
      System.out.println("Percent lean package A   :"); //User Input for percent lean of package A
      leanA = scan.nextInt();
      System.out.println("Price per pound package B:"); //User Input price per pound of package B
      priceB = scan.nextFloat();
      System.out.println("Percent lean package B   :"); //User Input for percent lean of package B
      leanB = scan.nextInt();
      
      costPoundA = priceA / (leanA / 100.0f); //Formula for the cost per pound of lean of package A
      costPoundB = priceB / (leanB / 100.0f); //Formula for the cost per pound of lean of package B
      
      System.out.printf("Package A cost per pound of lean: " + costPoundA); //Print the cost per pound of lean of package A
      System.out.printf("\nPackage B cost per pound of lean: " + costPoundB); //Print the cost per pound of lean of package B
      
      if (costPoundA < costPoundB) //If the cost per pound of lean of package A is lesser than package B then true otherwise false
         System.out.printf("\nPackage A is the best value"); //True Branch
      else //False Branch
         System.out.printf("\nPackage B is the best value");
   }
}