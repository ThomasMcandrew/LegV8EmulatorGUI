package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class PRNT extends RInstruction {
    public PRNT(String binary) {
        super(binary, "PRNT", "11111111101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new PRNT(binary);
    }

    @Override
    public void execute() {
    	System.out.println("X" + Rd + "  " + Integer.toHexString((int) Registers.get(Rd)) + " " + Registers.get(Rd));
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd;
    }
}
