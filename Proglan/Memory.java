// ========================
// Memory.java
// ========================
public class Memory {
    private int size = 100;
    private String[] mem;

    // Constructor with fixed size
    public Memory(int size) {
        this.size = size;
        mem = new String[size];
    }

    // Constructor with initial data
    public Memory(String[] data) {
        this.size = data.length;
        mem = new String[size];
        for (int i = 0; i < size; i++) {
            mem[i] = data[i];
        }
    }

    // Add item at address
    public void additem(int address, String data) {
        this.mem[address] = data;
    }

    // Get item at address
    public String getitem(int address) {
        return this.mem[address];
    }

    // Print memory dump
    public void dump() {
        for (int i = 0; i < size; i++) {
            String data = mem[i];
            if (data == null) data = "0000";
            if ((i % 10) == 0) System.out.printf("\n%4s ", data);
            else System.out.printf("%4s ", data);
        }
        System.out.println();
    }

    // Test Memory
    static public void main(String... args) {
        Memory m = new Memory(new String[]{"1007", "1008", "2007", "3008", "2109", "1109", "4300"});
        m.dump();
        m.additem(90, "1000");
        System.out.println("\nItem at 90: " + m.getitem(90));
    }
}
