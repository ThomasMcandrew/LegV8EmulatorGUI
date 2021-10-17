package legv8gui.emulator.instructions.cb;


import legv8gui.emulator.Emulator;
import legv8gui.emulator.instructions.CBInstruction;
import legv8gui.emulator.instructions.Instruction;
import legv8gui.emulator.memory.ConditionBits;

public class Bcond extends CBInstruction {

    public Bcond(String binary) {
        super(binary, "B.", "01010100");
    }

    @Override
    public Instruction newInstruction(String binary) {
        return new Bcond(binary);
    }

    @Override
    public void execute() {
        if(ConditionBits.get(Rt))
        {
            Emulator.Iterator+=COND_BR_address;
        }

    }

    @Override
    public String getInstruction() {
        return name + convertRt(Rt) + " " + COND_BR_address;
    }

    private String convertRt(int Rt) {
        if (Rt==0) { return "EQ";}
        else if (Rt==1) { return "NE";}
        else if (Rt==2) { return "HS";}
        else if (Rt==3) { return "LO";}
        else if (Rt==4) { return "MI";}
        else if (Rt==5) { return "PL";}
        else if (Rt==6) { return "VS";}
        else if (Rt==7) { return "VC";}
        else if (Rt==8) { return "HI";}
        else if (Rt==9) { return "LS";}
        else if (Rt==10) { return "GE";}
        else if (Rt==11) { return "LT";}
        else if (Rt==12) { return "GT";}
        else if (Rt==13) { return "LE";}
        else { return "Invalid";}

    }
}
