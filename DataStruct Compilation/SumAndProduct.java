import java.util.Scanner;

class SumAndProduct
{
   private Scanner scan = new Scanner(System.in); 
   public void runSumAndProduct()
   {
      int[] number = new int[10];
      int sum = 0, product = 1;
      
      System.out.println("Enter 10 integers:");
      for (int i = 0; i < number.length; i++)
      {
         System.out.println("Enter an integer:"); 
         number[i] = scan.nextInt();
         if (number[i] > 0)
         {
            sum = sum + number[i];
            product = product * number[i];
         }
      }
      System.out.println("The sum is " + sum + " and the product is " + product);
   }
}