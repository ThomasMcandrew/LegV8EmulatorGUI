package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class SUBI extends IInstruction {
    public SUBI(String binary) {
        super(binary, "SUBI", "1101000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) - immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
