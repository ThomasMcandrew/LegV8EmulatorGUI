package legv8gui.emulator.instructions.r;


import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.instructions.RInstruction;
import legv8gui.emulator.memory.Registers;

public class AND extends RInstruction {

    public AND(String binary) {
        super(binary, "AND", "10001010000");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new AND(binary);
    }

    @Override
    public void execute() {
        Registers.set(Rd,Registers.get(Rn) & Registers.get(Rm));
    }

    @Override
    public String getInstruction() {
        return name + " X"+Rd +" X" + Rn + " X" + Rm;
    }
}
