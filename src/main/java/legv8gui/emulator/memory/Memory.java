package legv8gui.emulator.memory;

import legv8gui.ui.MemoryPanel;
import legv8gui.util.BinaryUtils;

public class Memory {
    private static byte[] memory = new byte[4096];

    public static void store(long i, int adress) {
        byte one = (byte) ((i >> 56) & 0xFF);
        byte two = (byte) ((i >> 48) & 0xFF);
        byte three = (byte) ((i >> 40) & 0xFF);
        byte four = (byte) ((i >> 32) & 0xFF);
        byte five = (byte) ((i >> 24) & 0xFF);
        byte six = (byte) ((i >> 16) & 0xFF);
        byte seven = (byte) ((i >> 8) & 0xFF);
        byte eight = (byte) ((i >> 0) & 0xFF);
        int start = adress;
        memory[start] = one;
        start++;
        memory[start] = two;
        start++;
        memory[start] = three;
        start++;
        memory[start] = four;
        start++;
        memory[start] = five;
        start++;
        memory[start] = six;
        start++;
        memory[start] = seven;
        start++;
        memory[start] = eight;
    }
    public static long read(int address) {
        String num = "";
        for(int i = address;i < (address)+8;i++) {
            num += String.format("%8s", Integer.toBinaryString(memory[i] & 0xFF)).replace(' ', '0');
        }
        return BinaryUtils.parseBinary(num);
    }
    public static void print() {
        StringBuilder memoryString = new StringBuilder();
        StringBuilder hexString = new StringBuilder();
        String format = "%s";
        String formatHex = "%02X";
        for (int i = 0; i < memory.length; i++) {
            if(i > 0 && i%16 == 0){memoryString.append("\n"); hexString.append("\n"); }
            else if(i > 0 && i%8 == 0){memoryString.append(" "); hexString.append(" "); }
            memoryString.append(String.format(format, (memory[i] > 0 && memory[i] < 127? ((char)memory[i]) : ".")));
            hexString.append(String.format(formatHex,memory[i]));
        }
        String[] foo = memoryString.toString().split("\n");
        String[] foof = hexString.toString().split("\n");
        StringBuilder main = new StringBuilder();
        for(int i = 0; i < foo.length; i++){
            main.append(foof[i] + " : " + foo[i] + "\n");
        }
        MemoryPanel.textPane.setText(main.toString());
    }
}
