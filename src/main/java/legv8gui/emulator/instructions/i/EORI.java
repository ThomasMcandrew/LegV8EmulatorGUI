package legv8gui.emulator.instructions.i;


import legv8gui.emulator.instructions.IInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class EORI extends IInstruction {

    public EORI(String binary) {
        super(binary, "EORI", "1101001000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new EORI(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) ^ immediate);
    }

    @Override
    public String getInstruction()  {
        return name + " X"+ Rd + " X"+ Rn + " #" + immediate;
    }
}
