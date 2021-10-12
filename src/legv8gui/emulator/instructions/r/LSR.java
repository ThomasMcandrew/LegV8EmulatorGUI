package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class LSR extends RInstruction {

    public LSR(String binary) {
        super(binary, "LSR", "11010011010");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new LSR(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) >> shamt);
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + " X" + Rn + " #" + shamt;
    }
}
