package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class ADDI extends IInstruction {
    public ADDI(String binary) {
        super(binary, "ADDI", "1001000100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ADDI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) + immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd + " X"+ Rn + " #" + immediate;
    }
}
