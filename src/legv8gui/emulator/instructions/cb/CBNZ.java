package legv8gui.emulator.instructions.cb;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.CBInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Registers;

public class CBNZ extends CBInstruction {

    public CBNZ(String binary) {
        super(binary, "CBNZ", "10110101");
    }


    @Override
    public Instruction newInstruction(String binary) {
        return new CBNZ(binary);
    }

    @Override
    public void execute() {
            if(Registers.get(Rt)!=0)
            {
                Emulator.Iterator+=COND_BR_address;
            }
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", " + COND_BR_address;
    }
}
