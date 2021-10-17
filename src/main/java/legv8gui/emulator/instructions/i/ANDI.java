package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class ANDI extends IInstruction {

    public ANDI(String binary) {
        super(binary, "ANDI", "1001001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new ANDI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) & immediate);
    }

    @Override
    public String getInstruction() {
        return name + " X"+ Rd + " X"+ Rn + " #" + immediate;
    }
}
