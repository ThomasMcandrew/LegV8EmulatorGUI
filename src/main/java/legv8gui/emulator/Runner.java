package legv8gui.emulator;

import legv8gui.emulator.instructions.Instruction;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class Runner extends SwingWorker {
    private File file;

    public Runner(File file){
        this.file = file;
    }
    @Override
    protected Object doInBackground() throws Exception {
        String text = "";
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            text += scanner.nextLine() + "\n";
        }
        String[] ins = text.split("\n");
        Instruction[] instructions = new Instruction[ins.length];
        for(int i = 0 ; i < ins.length;i++){
            instructions[i] = Instruction.findInstruction(ins[i]);
        }
        for(Emulator.Iterator = 0; Emulator.Iterator < instructions.length;Emulator.Iterator++) {
            try {
                instructions[Emulator.Iterator].execute();
            }catch(Exception e) {
            }
        }
        return null;
    }
}
