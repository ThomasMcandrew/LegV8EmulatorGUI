package legv8gui.compiler;

import legv8gui.emulator.instructions.Instruction;

public class Compiler {

    public static String CompileLine(String line){
        return Instruction.getBinaryFromText(line);
    }

}
