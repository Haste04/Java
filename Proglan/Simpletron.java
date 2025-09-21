// ========================
// Simpletron.java
// ========================
public class Simpletron {
    private Memory memory = new Memory(100);
    private int pc; // program counter
    private String ir; // instruction register
    private int program_size;
    private String opcode, operand;

    public Simpletron(String filename) {
        try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue; // skip blanks
                String[] parts = line.split(" ");
                int address = Integer.parseInt(parts[0]);
                memory.additem(address, parts[1]);
                program_size++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Run the loaded program
    public void execute() {
        pc = 0;
        while (pc < 100) {
            ir = memory.getitem(pc);
            if (ir == null) break; // stop if no instruction

            opcode = ir.substring(0, 2);
            operand = ir.substring(2);

            microcode();
            pc++;
        }
        memory.dump();
    }

    // Read input from user
    private String getInput() {
        return new java.util.Scanner(System.in).nextLine();
    }

    // Micro-operations for each opcode
    private void microcode() {
        String data = null;
        switch (opcode) {
            case "10": // READ
                System.out.print("Enter value (00..99): ");
                data = getInput();
                while (data.length() < 4) {
                    data = "0" + data;
                }
                memory.additem(Integer.parseInt(operand.strip()), data);
                break;

            case "11": // WRITE
                data = memory.getitem(Integer.parseInt(operand.strip()));
                System.out.println("Output: " + data);
                break;

            // add more opcodes here later (LOAD, STORE, ADD, etc.)
            default:
                System.out.println("Unknown opcode: " + opcode);
        }
    }

    // Test Simpletron
    static public void main(String... args) {
        Simpletron st = new Simpletron("test.sml");
        st.execute();
    }
}
