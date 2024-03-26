/* Haggai P. Estavilla  BSCS - 1A
   Date: March 12, 2024
   The purpose of this program is to take deli orders from the Internet. It asks for the item, its price in cents, and if express delivery is wanted. 
   The program writes out the order and the charges. 
*/
import java.util.Scanner;
import java.text.*;
public class InternetDelicatessen 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations 
        DecimalFormat df = new DecimalFormat("#.00");
        byte delivery;
        float price;
        String item;

        System.out.printf("Enter the item: "); //User Input Item
        item = scan.nextLine();
        System.out.printf("Enter the price: "); //User Input Price
        price = scan.nextFloat();
        System.out.printf("Overnight delivery (0==no, 1==yes): "); //User Input 0 for no or 1 for yes to overnight delivery
        delivery = scan.nextByte();

        System.out.printf("\nInvoice:\n"); 
        System.out.printf("\t" + item + "\t\t" + df.format(price));
        if (delivery == 0) //If user inputs 0 for no to overnight delivery. Regular Delivery Charges apply
        {
            if (price < 10.00) //If the price is less than $10.00 then the delivery fee is $2.00
            {
                price += 2.00f; //Add 2 dollars to the price
                System.out.printf("\n\tDelivery\t2.00\n");
            }
            else //If the price is not less than $10.00 then the delivery fee is free
                System.out.printf("\n\tDelivery\tThe delivery is free\n");
        }
        else if (delivery == 1) //If user inputs 1 for yes to overnight delivery. Overnight Delivery Charges apply
        {
            if (price < 10.00) //If the price is less than $10.00 then the delivery fee is $5.00
            {
                price += 5.00f; //Add 5 dollars to the price
                System.out.printf("\n\tDelivery\t5.00\n");
            }
            else //If the price is not less than $10.00 then the delivery fee is $2.00
            {
                price += 3.00f; //Add 3 dollars to the price
                System.out.printf("\n\tDelivery\t3.00\n");
            }
        }
        else //If the user inputted neither 0 or 1 
            System.out.println("You inputted " + delivery + ", you must only input 0 for no and 1 for yes. Please try again");
        System.out.println("\tTotal\t\t" + df.format(price)); //Print total price
    }
}