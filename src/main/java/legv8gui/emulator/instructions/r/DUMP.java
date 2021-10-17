package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Memory;
import legv8gui.emulator.memory.Stack;

public class DUMP extends RInstruction {

    public DUMP(String binary) {
        super(binary, "DUMP", "11111111110");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new DUMP(binary);
    }

    @Override
    public void execute() {
    	System.out.println("______Stack______");
    	Stack.print();
    	System.out.println("_____Memory______");
    	Memory.print();
    	
    }

    @Override
    public String getInstruction() {
        return name;
    }
}
