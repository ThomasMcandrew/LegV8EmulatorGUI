package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class LSL extends RInstruction {

    public LSL(String binary) {
        super(binary, "LSL", "11010011011");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new LSL(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) << shamt);
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rd + " X" + Rn + " #" + shamt;
    }
}
