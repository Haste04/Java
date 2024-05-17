/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to print out the average
*/
class Weight
{
    private int[] data;
    public Weight(int[] init) //Constructor
    {
        data = new int[init.length];
        for (int j = 0; j < init.length; j++) 
            data[j] = init[j];
    }
  
  public int average() //Compute the sum and average
  {
    int sum = 0;
    for (int i = 0; i < data.length; i++)
        sum += data[i]; 
    return sum / data.length;
  }
}
public class Average
{  
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102}; //Array for values
                    
    Weight june = new Weight( values );
    int avg = june.average(); //Call to get the average
    System.out.println("average = " + avg ); //Print average
  }
}      