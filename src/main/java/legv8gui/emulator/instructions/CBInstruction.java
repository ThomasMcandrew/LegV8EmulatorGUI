package legv8gui.emulator.instructions;


import legv8gui.util.BinaryUtils;

public abstract class CBInstruction extends Instruction {
    protected int COND_BR_address, Rt;
    public CBInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }

    @Override
    public String toBinary(String input){
        input = input.substring(input.indexOf(" "));
        String[] arg = input.split(",");
        int rt = Integer.parseInt(arg[0].trim());
        int addr = Integer.parseInt(arg[1].trim());

        return opcode + BinaryUtils.D2B(addr,19) + BinaryUtils.D2B(rt,5);
    }

    @Override
    protected void parse() {
        String op = binary.substring(0,8);
        String cond = binary.substring(8,27);
        String rt = binary.substring(27,32);
        opcode = op;
        COND_BR_address = (int)BinaryUtils.parseBinaryBranch(cond)-1;
        Rt =(int) BinaryUtils.parseBinary(rt);
    }
}
