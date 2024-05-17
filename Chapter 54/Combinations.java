/*  /*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask the user for N and R and writes out NCR.
*/
import java.util.Scanner;
public class Combinations 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    long ncr;
    int n, r; //Local Declarations

    System.out.print("Enter N: "); //User Input N
    n = scan.nextInt();
    System.out.print("Enter R: "); //User Input R
    r = scan.nextInt();

    if (n >= r) {
      ncr = fact(n) / (fact(r) * fact(n - r));
      System.out.println("nCr = " + ncr); //Print ncr
    }
    else
      System.out.println("Error: R is too large.");
  }
  public static long fact(int num)  //Method 
  {
    long result;
    if (num < 0)
      throw new IllegalArgumentException("Number must be non-negative!");
    if (num > 20)
      throw new IllegalArgumentException("Number must be smaller than 21!");
      
    result = 1;
    for (int x = 1 ; x <= num ; x++)
      result *= x;
    return result;
  }
}
