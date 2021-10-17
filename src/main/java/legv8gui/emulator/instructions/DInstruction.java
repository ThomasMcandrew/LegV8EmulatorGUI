package legv8gui.emulator.instructions;


import legv8gui.util.BinaryUtils;

public abstract class DInstruction extends Instruction {
    protected int DT_address, op, Rn, Rt;
    public DInstruction(String binary, String name, String opcode) {
        super(binary, name, opcode);
        if(binary != null){
            parse();
        }
    }
    @Override
    public String toBinary(String input){
        input = input.substring(input.indexOf(" "));
        String[] arg = input.split(",");
        int n = Integer.parseInt(arg[1].trim().substring(2));
        int t = Integer.parseInt(arg[0].trim().substring(1));
        int d = Integer.parseInt(arg[2].trim().substring(1,arg[2].indexOf("]")-1));
        String output = opcode + BinaryUtils.D2B(d,9) + "00" + BinaryUtils.D2B(n,5) + BinaryUtils.D2B(t,5);

        return output;
    }


    @Override
    protected void parse() {
        String opp = binary.substring(0,11);
        String dt = binary.substring(11,20);
        String oop = binary.substring(20,22);
        String rn = binary.substring(22,27);
        String rt = binary.substring(27,32);
        opcode = opp;
        DT_address = (int)BinaryUtils.parseBinary(dt);
        op = (int) BinaryUtils.parseBinary(oop);
        Rn = (int)BinaryUtils.parseBinary(rn);
        Rt = (int)BinaryUtils.parseBinary(rt);
    }
}
