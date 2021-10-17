package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class EOR extends RInstruction {

    public EOR(String binary) {
        super(binary, "EOR", "11001010000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new EOR(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) ^ Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +" X" + Rn + " X" + Rm;
    }
}
