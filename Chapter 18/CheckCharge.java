/* Haggai P. Estavilla  BSCS - 1A
   Date: March 21, 2024
   The purpose of this program is to ask for the balance in each account and then writes out the service charge
*/
import java.util.Scanner;
public class CheckCharge 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        int checkingBalance, savingsBalance; 

        System.out.printf("Input the balance on your checking account: "); //Input the balance of the checking account
        checkingBalance = scan.nextInt();
        System.out.printf("Input the balance on your savings account : "); //Input the balance of the savings account
        savingsBalance = scan.nextInt();

        if (checkingBalance > 1000 || savingsBalance > 1500)//If the checking balance is > $1000 or if the savings balance is > $1500
            System.out.printf("The service charge is $0.00"); //Print the service charge
        else //Else
            System.out.printf("The service charge is $0.15"); //Print the service charge
    }
}
