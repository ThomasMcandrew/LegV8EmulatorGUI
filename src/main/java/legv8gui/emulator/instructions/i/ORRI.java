package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class ORRI extends IInstruction {
    public ORRI(String binary) {
        super(binary, "ORRI", "1011001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ORRI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) | immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
