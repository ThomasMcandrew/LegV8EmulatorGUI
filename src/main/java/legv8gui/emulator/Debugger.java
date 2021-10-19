package legv8gui.emulator;

import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Memory;
import legv8gui.emulator.memory.Stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Debugger {
    private File file;
    public Instruction[] instructions;
    public Debugger(File file){
        this.file = file;
        String text = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNext()){
            text += scanner.nextLine() + "\n";
        }
        String[] ins = text.split("\n");
        instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
    }
    public boolean hadNext(){
        return Emulator.Iterator < instructions.length;
    }
    public void next() {
        try {
            instructions[Emulator.Iterator].execute();
            Memory.print();
            Stack.print();
        }catch(Exception e) {
        }
    }
}
