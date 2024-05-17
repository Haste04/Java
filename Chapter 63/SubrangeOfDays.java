/*  Haggai P. Estavilla BSCS - 1A
    Date: May 14, 2024
    The purpose of this program is to print out the 
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
  
    public int average() //Compute the average
    {
      int sum = 0;
      for (int i = 0; i < data.length; i++) 
        sum += data[i];
      return sum / data.length;
    }

    public int subAverage(int start, int end) //Calculate average for range
    {
      int sum = 0;
      for (int i = start; i <= end; i++) 
        sum += data[i];
      return sum / (end - start + 1);
    }
  }
  
  public class SubrangeOfDays 
  {
    public static void main(String[] args) 
    {
      int[] values = {98, 99, 98, 99, 100, 101, 102, 100, 104, 105,
          105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
          105, 105, 104, 104, 103, 102, 102, 101, 100, 102}; //Array for values
  
      Weight june = new Weight(values);
      int avg = june.average() ;
      System.out.println("Overall average = " + avg); //Print overall average
      int midPoint = values.length / 2; // Integer division for whole numbers
      int firstHalfAvg = june.subAverage(0, midPoint); // Calculate average for the first half 
  
      int secondHalfStart = (values.length % 2 == 0) ? midPoint + 1 : midPoint; // Calculate average for the second half. If the length is odd, include the middle day in both halves
      int secondHalfAvg = june.subAverage(secondHalfStart, values.length - 1);
  
      System.out.println("First half average = " + firstHalfAvg); //Print first half average
      System.out.println("Second half average = " + secondHalfAvg); //Print second half average
      System.out.println("Difference = " + (firstHalfAvg - secondHalfAvg)); //Print the difference
    }
  }