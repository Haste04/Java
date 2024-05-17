/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to print the factorial of a number
*/
import java.util.Scanner; 
public class FactorialWithErrorFlag 
{  
   public static void main(String[] args)  
   {   
        Scanner scan = new Scanner(System.in); 
        long fact;
        int num; //Local Declarations

        System.out.print("Enter number: "); //User Input number   
        num = scan.nextInt();
        fact = Factorial(num);
         
        if (fact >= 0) 
            System.out.println("Factorial of " + num + " is " + fact); //Print output
        else  
            System.out.println("Number should be non-negative.");  //Print output
   }
   public static long Factorial(int num) //Method to compute the factorial
   {
       if (num < 0 || num > 20)  
            return -1;  
       else  
       {  
            int fact = num, a;  
            for (a = (num - 1) ; a > 1 ; a--)  
                  fact = fact * a;  
            return fact;  
        }  
   }
}