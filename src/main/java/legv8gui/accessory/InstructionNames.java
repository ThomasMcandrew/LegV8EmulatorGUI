package legv8gui.accessory;

import legv8gui.emulator.instructions.Instruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class InstructionNames {

    public static final ArrayList<String> Instructions = (ArrayList<String>) Arrays.stream(Instruction.instructions).map(x -> x.getClass().getSimpleName()).collect(Collectors.toList());
}
