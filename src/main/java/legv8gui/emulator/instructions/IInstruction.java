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
        input = input.substring(input.indexOf(" "));
        String[] arg = input.split(",");
        int n = Integer.parseInt(arg[1].trim().substring(1));
        int d = Integer.parseInt(arg[0].trim().substring(1));
        int i = Integer.parseInt(arg[2].trim().substring(1));
        String output = opcode + BinaryUtils.D2B(i,12) + BinaryUtils.D2B(n,5) + BinaryUtils.D2B(d,5);

        return output;    }

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
