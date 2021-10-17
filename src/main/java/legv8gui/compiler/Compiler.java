package legv8gui.compiler;

import legv8gui.emulator.instructions.Instruction;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Compiler {

    public static String CompileLine(String line){
        return Instruction.getBinaryFromText(line);
    }
    public static File CompileFile(File file){
        SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                String text = "";
                Scanner scan = new Scanner(file);
                while (scan.hasNext()){
                    text += Instruction.getBinaryFromText(scan.nextLine()) + "\n";
                }
                return text;
            }
        };
        worker.execute();
        String binary = "Error Compiling to binary";
        try {
            binary = (String) worker.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        File bin = new File(file.getAbsolutePath()+".bin");
        try {
            FileWriter writer = new FileWriter(bin);
            writer.write(binary);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bin;
    }
}
