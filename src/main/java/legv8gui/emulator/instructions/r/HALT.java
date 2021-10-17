package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Memory;
import legv8gui.emulator.memory.Stack;

public class HALT extends RInstruction {

    public HALT(String binary) {
        super(binary, "HALT", "11111111111");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new HALT(binary);
    }

    @Override
    public void execute() {
    	System.out.println("______Stack______");
    	Stack.print();
    	System.out.println("_____Memory______");
    	Memory.print();
    	System.exit(1);
    }

    @Override
    public String getInstruction() {
        return name;
    }
}
