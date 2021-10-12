package legv8gui.emulator.instructions.cb;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.CBInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class CBZ extends CBInstruction {

    public CBZ(String binary) {
        super(binary, "CBZ", "10110100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new CBZ(binary);
    }

    @Override
    public void execute() {
        if(Registers.get(Rt)==0)
        {
            Emulator.Iterator+=COND_BR_address;
        }
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", " + COND_BR_address;
    }
}
