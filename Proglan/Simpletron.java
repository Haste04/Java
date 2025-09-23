// ========================
// Simpletron.java
// ========================

public class Simpletron
{
   private int pc, accumulator;
   private String ir, opcode, operand;
   private Memory memory = new Memory(100);
   private int program_size = 0;
   
   private String filename;
   public Simpletron(String filename)
   {
      try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(filename))) 
        {
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue; 
                if (line.startsWith(";")) continue; 

                // split on whitespace
                String[] parts = line.split("\\s+");
                if (parts.length < 2) continue; 

                int address = Integer.parseInt(parts[0]);
                String instruction = parts[1];

                // make sure it's always 4 digits 
                instruction = String.format("%04d", Integer.parseInt(instruction));
                memory.additem(address, instruction);
                program_size++;
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

   }
   
   public void run() //Run the simpletron program directly
   {
       pc = 0;
       while (pc < 100) 
       {
            ir = memory.getitem(pc);
            if (ir == null) break; // stop if no instruction

            opcode = ir.substring(0, 2);
            operand = ir.substring(2);

            decode(opcode);
            pc++;
       }
       
       System.out.println("-- PROGRAM HALTED --");
       System.out.println("\n\nREGISTERS:");
       System.out.println("Accumulator: " + accumulator);
       System.out.println("Program Counter: " + pc);
       System.out.println("Instruction Register: " + ir);
       System.out.println("Operation Code: " + opcode);
       System.out.println("Operand: " + operand);
   }
   
   public void step() //run simpletron sml, display the content of all variables and memory
   {
      ir = fetch(pc);
      if(ir == null)
      {
         System.out.println("No instruct at address " + pc);
         return;
      }
      
      opcode = ir.substring(0,2);
      operand = ir.substring(2);
      System.out.println("\n\nREGISTERS:");
      System.out.println("Accumulator: " + accumulator);
      System.out.println("Program Counter: " + pc);
      System.out.println("Instruction Register: " + ir);
      System.out.println("Operation Code: " + opcode);
      System.out.println("Operand: " + operand);
      memory.dump();
      decode(opcode);
      pc++;
   }
   
   public String fetch(int address) //get instruction from memory to IR
   {
      ir = memory.getitem(address);
      return ir;
   }
   
   public void store(int address) //store from accumulator from memory
   {
      String accStr = String.format("%04d", accumulator);
      memory.additem(address, accStr);
   }

   private String getInput() 
   {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
   }   
   
   public void decode(String opcode)
   {
        String data = null;
        int addr;
        switch (opcode) 
        {
            case "10": // READ
                System.out.println("Enter value: ");
                data = getInput();
                while (data.length() < 4) 
                    data = "0" + data;
                
                memory.additem(Integer.parseInt(operand.strip()), data);
                break;

            case "11": // WRITE
                data = memory.getitem(Integer.parseInt(operand.strip()));
                System.out.println("Output: " + data );
                break;

            case "20": // LOAD
                accumulator = Integer.parseInt(memory.getitem(Integer.parseInt(operand.strip())));
                break;

            case "21": // STORE
                store(Integer.parseInt(operand.strip()));
                break;

            case "22": // LOADI (immediate)
                accumulator = Integer.parseInt(operand.strip());
                break;

            case "30": // ADDM 
                accumulator += Integer.parseInt(memory.getitem(Integer.parseInt(operand.strip())));
                break;

            case "31": // SUBM
                addr = Integer.parseInt(operand.strip());
                accumulator -= Integer.parseInt(memory.getitem(addr));
                break;

            case "32": // DIVM
                addr = Integer.parseInt(operand.strip());
                accumulator /= Integer.parseInt(memory.getitem(addr));
                break;

            case "33": // MODM
                addr = Integer.parseInt(operand.strip());
                accumulator %= Integer.parseInt(memory.getitem(addr));
                break;

            case "34": // MULM
                addr = Integer.parseInt(operand.strip());
                accumulator *= Integer.parseInt(memory.getitem(addr));
                break;

            case "35": // ADDI
            accumulator += Integer.parseInt(operand.strip());
            break;

            case "36": // SUBI
                accumulator -= Integer.parseInt(operand.strip());
                break;

            case "37": // DIVI
                accumulator /= Integer.parseInt(operand.strip());
                break;

            case "38": // MODI
                accumulator %= Integer.parseInt(operand.strip());
                break;

            case "39": // MULI
                accumulator *= Integer.parseInt(operand.strip());
                break;
        
            case "40": // JMP
                pc = Integer.parseInt(operand.strip()) - 1;
                break;

            case "41": // JN
                if (accumulator < 0)
                    pc = Integer.parseInt(operand.strip()) - 1;
                break;

            case "42": // JZ
                if (accumulator == 0)
                    pc = Integer.parseInt(operand.strip()) - 1;
                break;


            case "43": // HALT
                pc = 100; 
                break;

            default:
                System.out.println("Unknown opcode: " + opcode);
        }

   }
   
   static public void main(String... args) 
   {
        Simpletron st = new Simpletron("test.sml");
        while (st.pc < 100) 
        {
            st.step();
        }
    }
}
