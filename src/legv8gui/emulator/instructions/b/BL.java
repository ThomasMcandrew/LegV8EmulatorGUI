package legv8gui.emulator.instructions.b;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.BInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class BL extends BInstruction {

    public BL(String binary) {
        super(binary, "BL", "100101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new BL(binary);
    }

    @Override
    public void execute() {
        Registers.set(30, Emulator.Iterator+1);
        Emulator.Iterator+=address;
    }

    @Override
    public String getInstruction() {
        return name + " " + address;
    }
}
