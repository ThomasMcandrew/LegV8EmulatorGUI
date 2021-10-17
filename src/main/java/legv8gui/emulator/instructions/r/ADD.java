package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class ADD extends RInstruction {


    public ADD(String binary) {
        super(binary, "ADD","10001011000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ADD(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) + Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +", X" + Rn + ", X" + Rm;
    }
}
