package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.ConditionBits;
import legv8gui.emulator.memory.Registers;

public class SUBS extends RInstruction {
    public SUBS(String binary) {
        super(binary, "SUBS", "11101011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new SUBS(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,(Registers.get(Rn)-Registers.get(Rm)));
        ConditionBits.set((Registers.get(Rn)-Registers.get(Rm)));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
