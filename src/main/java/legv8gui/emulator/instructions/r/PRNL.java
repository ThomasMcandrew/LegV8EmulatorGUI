package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;

public class PRNL extends RInstruction {
    public PRNL(String binary) {
        super(binary, "PRNL", "11111111100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new PRNL(binary);
    }

    @Override
    public void execute() {
    	System.out.println();
    }

    @Override
    public String getInstruction() {
        return name;
    }
}
