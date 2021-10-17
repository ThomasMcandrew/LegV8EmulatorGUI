package legv8gui.emulator.instructions.r;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class BR extends RInstruction {

    public BR(String binary) {
        super(binary, "BR", "11010110000");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new BR(binary);
    }

    @Override
    public void execute() {
        Emulator.Iterator=(int) Registers.get(Rn)-1;
    }

    @Override
    public String getInstruction() {
        return name + " X" +Rn;
    }
}
