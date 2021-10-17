package legv8gui.emulator.instructions.b;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.BInstruction;
import legv8gui.emulator.instructions.Instruction;

public class B extends BInstruction {

    public B(String binary) {
        super(binary, "B", "000101");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new B(binary);
    }

    @Override
    public void execute() {
        Emulator.Iterator+=address;
    }

    @Override
    public String getInstruction() {
        return name + " " + address;
    }
}
