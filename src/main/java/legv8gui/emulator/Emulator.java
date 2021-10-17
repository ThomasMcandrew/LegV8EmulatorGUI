package legv8gui.emulator;

import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Memory;
import legv8gui.emulator.memory.Registers;
import legv8gui.emulator.memory.Stack;

import java.io.File;
import java.io.IOException;

public class Emulator {

    public static int Iterator;
    public Emulator(){
        Registers.initRegisters();
        Memory.print();
        Stack.print();
        Registers.set(28, 512L);
        Registers.set(29, 512);
    }
    public static void run(String line){
        Instruction i = Instruction.findInstruction(line);
        if(i == null){
            return;
        }
        i.execute();
        Memory.print();
        Stack.print();
    }
    public static void run(File file){
        String[] ins = null;
        try {
            ins = FileReader.readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Instruction[] instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
        printInstruction(instructions);
        for(Iterator = 0; Iterator < instructions.length;Iterator++) {
            try {
                instructions[Iterator].execute();
            }catch(Exception e) {
                printInstructionFail(instructions);
            }
        }
    }
    public static void printInstruction(Instruction[] instructions) {
        for(int i = 0 ; i < instructions.length;i++){
            if(instructions[i] != null) {
                System.out.println(instructions[i].getInstruction());
            }else{
                System.out.println("Fail on line " + i+1);
            }
        }
    }
    public static void printInstructionFail(Instruction[] instructions) {
        for(int i = 0 ; i < instructions.length;i++){
            if(instructions[i] != null) {
                if(i == Iterator) {
                    System.out.print("--->");
                }
                System.out.println(instructions[i].getInstruction());
            }else{
                System.out.println("Fail on line " + i+1);
            }
        }
    }

    public static void printRegisters() {
        for (int i=0 ; i<32 ; i++)
        {
            System.out.println("X" + i + " h: " + Integer.toHexString((int)Registers.get(i)) + " d:" + (int)Registers.get(i));
        }
    }

}
