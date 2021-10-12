package legv8gui.emulator.instructions;


import legv8gui.util.BinaryUtils;

public  abstract class IInstruction extends Instruction {

    protected long immediate;
    protected int Rn,Rd;

    public IInstruction(String binary,String name,String opcode) {
        super(binary, name,opcode);
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
        String op = binary.substring(0,10);
        String imm = binary.substring(10,22);
        String rn = binary.substring(22,27);
        String rd = binary.substring(27,32);
        opcode = op;
        immediate = BinaryUtils.parseBinary(imm);
        Rn = (int)BinaryUtils.parseBinary(rn);
        Rd = (int)BinaryUtils.parseBinary(rd);
    }
}
