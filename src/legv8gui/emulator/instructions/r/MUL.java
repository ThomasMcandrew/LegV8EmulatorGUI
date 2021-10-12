package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class MUL extends RInstruction {
    public MUL(String binary) {
        super(binary, "MUL", "10011011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new MUL(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) * Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
