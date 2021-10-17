package legv8gui.emulator.memory;

import legv8gui.ui.StackPanel;
import legv8gui.util.BinaryUtils;

public class Stack {
    private static byte[] stack = new byte[512];
    
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
        stack[start] = one;
        start++;
        stack[start] = two;
        start++;
        stack[start] = three;
        start++;
        stack[start] = four;
        start++;
        stack[start] = five;
        start++;
        stack[start] = six;
        start++;
        stack[start] = seven;
        start++;
        stack[start] = eight;
    }
    public static long read(int address) {
        String num = "";
        for(int i = address;i < (address)+8;i++) {
            num += String.format("%8s", Integer.toBinaryString(stack[i] & 0xFF)).replace(' ', '0');
        }
        return BinaryUtils.parseBinary(num);
    }
    public static void print() {
        String stackString = "";
        for(int i = 0; i < stack.length;i++) {
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " ");
            i++;
            stackString += (String.format("%02x", stack[i]) + " \n");
        }
        StackPanel.textPane.setText(stackString);
    }
    }
