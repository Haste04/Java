import java.util.Scanner;
public class MoreTirePressure 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        short RFrontPressure, LFrontPressure, RRearPressure, LRearPressure;
        boolean goodPressure = true;
        
        System.out.println("Input right front pressure:");
        RFrontPressure = scan.nextShort();
        if (RFrontPressure < 35 || RFrontPressure > 45)
        {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input left front pressure:");
        LFrontPressure = scan.nextShort();
        if (LFrontPressure < 35 || LFrontPressure > 45)
        {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input right rear pressure:");
        RRearPressure = scan.nextShort();
        if (RRearPressure < 35 || RRearPressure > 45)
        {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input right front pressure:");
        LRearPressure = scan.nextShort();
        if (LRearPressure < 35 || LRearPressure > 45)
        {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }

        if (goodPressure && LFrontPressure == RFrontPressure && LRearPressure == RRearPressure)
            System.out.println("inflation is OK");
        else
            System.out.println("inflation is BAD");
    }
}