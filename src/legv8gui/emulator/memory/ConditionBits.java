package legv8gui.emulator.memory;

public class ConditionBits {
    private static boolean EQ;
    private static boolean GE;
    private static boolean GT;
    private static boolean HI;
    private static boolean HS;
    private static boolean LE;
    private static boolean LO;
    private static boolean LS;
    private static boolean LT;
    private static boolean MI;
    private static boolean NE;
    private static boolean PL;
    private static boolean VC;
    private static boolean VS;

    public static void set(long S){
        EQ = S == 0;
        GE = S >= 0;
        GT = S > 0;
        HI = S > 0;
        HS = S >= 0;
        LE = S <= 0;
        LO = S < 0;
        LS = S <= 0;
        LT = S < 0;
        MI = S < 0;
        NE = S != 0;
        PL = S >= 0;
        VC = false;
        VS = false;
    }

    public static boolean get(int val){
        switch (val){
            case 0:
                return EQ;
            case 1:
                return NE;
            case 2:
                return HS;
            case 3:
                return LO;
            case 4:
                return MI;
            case 5:
                return PL;
            case 6:
                return VS;
            case 7:
                return VC;
            case 8:
                return HI;
            case 9:
                return LS;
            case 10:
                return GE;
            case 11:
                return LT;
            case 12:
                return GT;
            case 13:
                return LE;
        }
        return false;
    }
}
