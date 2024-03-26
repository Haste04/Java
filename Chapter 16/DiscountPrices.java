/* Haggai P. Estavilla  BSCS - 1A
   Date: February 29, 2024
   The purpose of this program is to ask for the amount of a purchase, then calculate the discounted price
*/
import java.util.Scanner;
public class DiscountPrices
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int inputAmount, discountAmount; //Local Declarations
      
      System.out.println("Enter amount of purchases: "); //User input for amount of a purchase
      inputAmount = scan.nextInt();
      
      if (inputAmount > 10) //If amount of a purchase is over 10
      { //True Branch
         discountAmount = inputAmount - (int)(inputAmount * 0.10) ; //Formula for the dicount amount
         System.out.printf("Discounted price: " + discountAmount); //Print the output of the discount
      } 
      else //False Branch
      System.out.printf("Discounted price: " + inputAmount); //Print the output
   }
}
