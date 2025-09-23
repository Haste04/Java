/* Haggai P. Estavilla BSCSA - 3A */
import java.io.*;
import java.util.Scanner;
public class Memory 
{
    private int size = 100; 
    private String[] mem;    

    public Memory(int size) 
    {
        this.size = size;
        mem = new String[size];

        for (int i = 0; i < size; i++) 
        {
            mem[i] = "0000";
        }
    }
    public Memory(String[] data) 
    {
        int datasize = data.length;
        mem = new String[datasize];

        for (int i = 0; i < datasize; i++) 
            mem[i] = data[i];
        
        for (int i = datasize; i < size; i++) 
            mem[i] = "+0000";
        
    }

    public void additem(int address, String data) 
    {
        if (address >= 0 && address < mem.length) 
            mem[address] = data;
        
        else 
            System.out.println("Address out of bounds");
        
    }
    
    public String getitem(int address)
    {
        if (address >= 0 && address < mem.length) 
            return mem[address];
        else 
            return null;
    }

    public void dump() 
    {
        System.out.println("MEMORY:\n");


        System.out.print("        ");
        for (int col = 0; col < 10; col++) 
            System.out.printf("%10d", col);
        
        System.out.println();

        for (int i = 0; i < mem.length; i++) 
        {
   
            if (i % 10 == 0) 
            {
                System.out.printf("%02d      ", i);
            }

            String val = mem[i];
            if (val == null) val = "0000";
            System.out.printf("%10s", "+" + val);

            if ((i + 1) % 10 == 0) 
                System.out.println();
           
        }
        System.out.println(); 
    }


    public static void main(String[] args) 
    {
        try
        {
           File file = new File("test.sml");
           Scanner reader = new Scanner(file);
           StringBuilder sb = new StringBuilder();
           Memory m = new Memory(100);  

           while (reader.hasNextLine()) 
           {
                int result = -1;
                String result2 = "";
                String line = reader.nextLine().trim();
                
                int commentIndex = line.indexOf(';');
                if (commentIndex != -1) 
                    line = line.substring(0, commentIndex).trim();
                
                String[] parts = line.split("\\s+");

                for (int i = 0; i < parts.length; i++) 
                {
                    String part = parts[i];

                    if (part.matches("\\d+")) 
                    {
               
                        if (result == -1) 
                            result = Integer.parseInt(part); 
                        else 
                            result2 = part; 
                    }
                } 
                
                if (result != -1 && !result2.isEmpty()) 
                    m.additem(result, result2);
           }       
           reader.close();
           m.dump();
        }
        catch(FileNotFoundException e)
        {
           System.out.println("An error has occured");
           e.printStackTrace();
        }
    }
}
