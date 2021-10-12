package legv8gui.emulator.instructions;


import legv8gui.accessory.InstructionNames;
import legv8gui.emulator.instructions.d.*;
import legv8gui.emulator.instructions.r.*;
import legv8gui.emulator.instructions.b.*;
import legv8gui.emulator.instructions.cb.*;
import legv8gui.emulator.instructions.i.*;

import java.util.Locale;

public abstract class Instruction {
    protected String opcode;
    protected String name;
    protected String binary;
    public static Instruction instructions[] =
            {
                    new ADD(null),
                    new ADDI(null),
                    new AND(null),
                    new ANDI(null),
                    new B(null),
                    new Bcond(null),
                    new BL(null),
                    new BR(null),
                    new CBNZ(null),
                    new CBZ(null),
                    new DUMP(null),
                    new EOR(null),
                    new EORI(null),
                    new HALT(null),
                    new LDUR(null),
                    new LSL(null),
                    new LSR(null),
                    new MUL(null),
                    new ORR(null),
                    new ORRI(null),
                    new PRNL(null),
                    new PRNT(null),
                    new STUR(null),
                    new SUB(null),
                    new SUBI(null),
                    new SUBIS(null),
                    new SUBS(null)
            };
    public Instruction(String binary,String name,String opcode){
        this.opcode = opcode;
        this.name = name;
        this.binary = binary;
    }
    public abstract Instruction newInstruction(String binary);

    public abstract void execute();

    protected abstract void parse();

    public abstract String getInstruction();

    public String getName() {
        return name;
    }

    public String getOpcode() {
        return opcode;
    }
    public static Instruction findInstruction(String binary){
        for(int i = 0; i < instructions.length;i++){
            if(binary.startsWith(instructions[i].opcode)){
                return instructions[i].newInstruction(binary);
            }
        }
        return null;
    }
    public abstract String toBinary(String input);

    public static String getBinaryFromText(String input){
        String instruction = null;
        for(int i = 0; i < instructions.length; i++){
            if(input.split(" ")[0].trim().compareTo(instructions[i].name) == 0){
                instruction = instructions[i].toBinary(input);
            }
        }
        if(instruction == null){
            //send terminal error and return
        }
        return instruction;
    }
}
