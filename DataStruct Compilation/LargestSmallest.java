import java.util.*;

class LargestSmallest
{
   private Scanner scan = new Scanner(System.in);
   public void runLargestSmallestMenu()
   {
      int one, two, three;
      System.out.println("Enter 3 numbers");

      one = scan.nextInt();
      two = scan.nextInt();
      three = scan.nextInt();


      if(two > one)
         one = two;
      if(three > one)
         one = three;

      System.out.println("The largest number is: " + one);
   }
}