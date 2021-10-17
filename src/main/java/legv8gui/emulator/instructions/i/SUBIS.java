package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.ConditionBits;
import legv8gui.emulator.memory.Registers;

public class SUBIS extends IInstruction {
    public SUBIS(String binary) {
        super(binary, "SUBIS", "1111000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBIS(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) - immediate);
        ConditionBits.set(Registers.get(Rn) - immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + ", X" + Rn + ", #" + immediate;
    }
}
