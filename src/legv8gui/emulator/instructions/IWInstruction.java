package legv8gui.emulator.instructions;


import legv8gui.util.BinaryUtils;

public abstract class IWInstruction extends Instruction {
    protected int MOV_Immediate, Rd;
    public IWInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }
    @Override
    public String toBinary(String input){
        return null;
    }

    @Override
    protected void parse() {
        String op = binary.substring(0,11);
        String mov = binary.substring(11,27);
        String rd = binary.substring(27,32);
        opcode = op;
        MOV_Immediate = (int)BinaryUtils.parseBinary(mov);
        Rd = (int) BinaryUtils.parseBinary(rd);
    }
}
