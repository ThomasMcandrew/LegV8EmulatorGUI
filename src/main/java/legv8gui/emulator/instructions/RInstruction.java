package legv8gui.emulator.instructions;

import legv8gui.util.BinaryUtils;

public abstract class RInstruction extends Instruction  {

    protected int Rm, shamt, Rn, Rd;

    public RInstruction(String binary,String name,String opcode) {
        super(binary,name,opcode);
        if(binary != null) {
            parse();
        }
    }
    @Override
    public String toBinary(String input){
        input = input.substring(input.indexOf(" "));
        String[] arg = input.split(",");
        int m = Integer.parseInt(arg[2].trim().substring(1));
        int n = Integer.parseInt(arg[1].trim().substring(1));
        int d = Integer.parseInt(arg[0].trim().substring(1));
        String output = opcode + BinaryUtils.D2B(m,5) + "000000" + BinaryUtils.D2B(n,5) + BinaryUtils.D2B(d,5);

        return output;
    }

    @Override
    protected void parse(){
        String op = binary.substring(0,11);
        String rm = binary.substring(11,16);
        String sham = binary.substring(16,22);
        String rn = binary.substring(22,27);
        String rd = binary.substring(27,32);
        opcode = op;
        Rm = (int) BinaryUtils.parseBinary(rm);
        shamt = (int)BinaryUtils.parseBinary(sham);
        Rn = (int)BinaryUtils.parseBinary(rn);
        Rd = (int)BinaryUtils.parseBinary(rd);
    }
}
