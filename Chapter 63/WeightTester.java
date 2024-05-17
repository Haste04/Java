/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to print out the values
*/
class Weight
{
  private int[] data;

  public Weight(int[] init) //Constructor
  {
    data = new int[init.length]; // Make data the same length as the array referenced by init.
    
    for (int j = 0; j < init.length; j++) // Copy values from the input data to data.
      data[j] = init[j];
  }
  public String toString() //Print Output
  {
      String output;
      output = "Weight: [";
      for (int i = 0; i < data.length; i++)
        output += data[i] + ", ";
      output = output.substring(0, output.length() - 2);
      output += "]";
      return output;
  }
}
public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102}; //Array for values
    Weight june = new Weight( values );
    System.out.println( june ); //Print output
  }
}      