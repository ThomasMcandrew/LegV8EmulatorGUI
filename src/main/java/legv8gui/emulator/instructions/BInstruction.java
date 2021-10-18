package legv8gui.emulator.instructions;


import legv8gui.util.BinaryUtils;

public abstract class BInstruction extends Instruction {
    protected int address;
    public BInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }

    @Override
    public String toBinary(String input){
        input = input.substring(input.indexOf(" "));
        int addr = Integer.parseInt(input);
        String output = opcode + BinaryUtils.D2B(addr,26);
        return output;
    }

    @Override
    protected void parse() {
        String op = binary.substring(0,6);
        String ad = binary.substring(6,32);
        opcode = op;
        address = (int) BinaryUtils.parseBinaryBranch(ad)-1;
    }
}
