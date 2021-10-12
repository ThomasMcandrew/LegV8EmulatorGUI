package legv8gui.emulator.instructions.d;


import legv8gui.emulator.instructions.DInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.Memory;
import legv8gui.emulator.memory.Registers;
import legv8gui.emulator.memory.Stack;

public class LDUR extends DInstruction {

    public LDUR(String binary) {
        super(binary, "LDUR", "11111000010");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new LDUR(binary);
    }

    @Override
    public void execute() {
    	if(Rn == 28 || Rn == 29) {
    		Registers.set(Rt, Stack.read((int)Registers.get(Rn) + DT_address));
    	}else {
    		Registers.set(Rt, Memory.read((int)Registers.get(Rn) + DT_address));
    	}
    }

    @Override
    public String getInstruction() {
        return name + " X" + Rt + ", [X" + Rn+ ", #" + DT_address + "]";
    }
}
