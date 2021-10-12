package legv8gui.emulator.memory;

import legv8gui.ui.RegisterPanel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Registers {
    private static long X0;
    private static long X1;
    private static long X2;
    private static long X3;
    private static long X4;
    private static long X5;
    private static long X6;
    private static long X7;
    private static long X8;
    private static long X9;
    private static long X10;
    private static long X11;
    private static long X12;
    private static long X13;
    private static long X14;
    private static long X15;
    private static long X16;
    private static long X17;
    private static long X18;
    private static long X19;
    private static long X20;
    private static long X21;
    private static long X22;
    private static long X23;
    private static long X24;
    private static long X25;
    private static long X26;
    private static long X27;
    private static long X28;
    private static long X29;
    private static long X30;
    private static long X31 = 0;

    public static long get(int reg){
        switch (reg){
            case 0:
                return X0;
            case 1:
                return X1;
            case 2:
                return X2;
            case 3:
                return X3;
            case 4:
                return X4;
            case 5:
                return X5;
            case 6:
                return X6;
            case 7:
                return X7;
            case 8:
                return X8;
            case 9:
                return X9;
            case 10:
                return X10;
            case 11:
                return X11;
            case 12:
                return X12;
            case 13:
                return X13;
            case 14:
                return X14;
            case 15:
                return X15;
            case 16:
                return X16;
            case 17:
                return X17;
            case 18:
                return X18;
            case 19:
                return X19;
            case 20:
                return X20;
            case 21:
                return X21;
            case 22:
                return X22;
            case 23:
                return X23;
            case 24:
                return X24;
            case 25:
                return X25;
            case 26:
                return X26;
            case 27:
                return X27;
            case 28:
                return X28;
            case 29:
                return X29;
            case 30:
                return X30;
            case 31:
                return 0;
            default:
                break;
        }
        return 0;
    }

    public static void set(int reg, long val) {
        switch (reg) {
            case 0:
                X0 = val;
                RegisterPanel.X0.setText("X0:{" + X0 + "}");
                break;
            case 1:
                X1 = val;
                RegisterPanel.X1.setText("X1:{" + X1 + "}");
                break;
            case 2:
                X2 = val;
                RegisterPanel.X2.setText("X2:{" + X2 + "}");
                break;
            case 3:
                X3 = val;
                RegisterPanel.X3.setText("X3:{" + X3 + "}");
                break;
            case 4:
                X4 = val;
                RegisterPanel.X4.setText("X4:{" + X4 + "}");
                break;
            case 5:
                X5 = val;
                RegisterPanel.X5.setText("X5:{" + X5 + "}");
                break;
            case 6:
                X6 = val;
                RegisterPanel.X6.setText("X6:{" + X6 + "}");
                break;
            case 7:
                X7 = val;
                RegisterPanel.X7.setText("X7:{" + X7 + "}");
                break;
            case 8:
                X8 = val;
                RegisterPanel.X8.setText("X8:{" + X8 + "}");
                break;
            case 9:
                X9 = val;
                RegisterPanel.X9.setText("X9:{" + X9 + "}");
                break;
            case 10:
                X10 = val;
                RegisterPanel.X10.setText("X10:{" + X10 + "}");
                break;
            case 11:
                X11 = val;
                RegisterPanel.X11.setText("X11:{" + X11 + "}");
                break;
            case 12:
                X12 = val;
                RegisterPanel.X12.setText("X12:{" + X12 + "}");
                break;
            case 13:
                X13 = val;
                RegisterPanel.X13.setText("X13:{" + X13 + "}");
                break;
            case 14:
                X14 = val;
                RegisterPanel.X14.setText("X14:{" + X14 + "}");
                break;
            case 15:
                X15 = val;
                RegisterPanel.X15.setText("X15:{" + X15 + "}");
                break;
            case 16:
                X16 = val;
                RegisterPanel.X16.setText("X16:{" + X16 + "}");
                break;
            case 17:
                X17 = val;
                RegisterPanel.X17.setText("X17:{" + X17 + "}");
                break;
            case 18:
                X18 = val;
                RegisterPanel.X18.setText("X18:{" + X18 + "}");
                break;
            case 19:
                X19 = val;
                RegisterPanel.X19.setText("X19:{" + X19 + "}");
                break;
            case 20:
                X20 = val;
                RegisterPanel.X20.setText("X20:{" + X20 + "}");
                break;
            case 21:
                X21 = val;
                RegisterPanel.X21.setText("X21:{" + X21 + "}");
                break;
            case 22:
                X22 = val;
                RegisterPanel.X22.setText("X22:{" + X22 + "}");
                break;
            case 23:
                X23 = val;
                RegisterPanel.X23.setText("X23:{" + X23 + "}");
                break;
            case 24:
                X24 = val;
                RegisterPanel.X24.setText("X24:{" + X24 + "}");
                break;
            case 25:
                X25 = val;
                RegisterPanel.X25.setText("X25:{" + X25 + "}");
                break;
            case 26:
                X26 = val;
                RegisterPanel.X26.setText("X26:{" + X26 + "}");
                break;
            case 27:
                X27 = val;
                RegisterPanel.X27.setText("X27:{" + X27 + "}");
                break;
            case 28:
                X28 = val;
                RegisterPanel.X28.setText("X28:{" + X28 + "}");
                break;
            case 29:
                X29 = val;
                RegisterPanel.X29.setText("X29:{" + X29 + "}");
                break;
            case 30:
                X30 = val;
                RegisterPanel.X0.setText("X30:{" + X30 + "}");
                break;
            default:
                break;
        }
    }



    public static long getX0() {
        return X0;
    }

    public static void setX0(long x0) {
        X0 = x0;
        RegisterPanel.X0.setText("X0:{" + X0 + "}");
    }

    public static long getX1() {
        return X1;
    }

    public static void setX1(long x1) {
        X1 = x1;
        RegisterPanel.X1.setText("X1:{" + X1 + "}");
    }

    public static long getX2() {
        return X2;
    }

    public static void setX2(long x2) {
        X2 = x2;
        RegisterPanel.X2.setText("X2:{" + X2 + "}");
    }

    public static long getX3() {
        return X3;
    }

    public static void setX3(long x3) {
        X3 = x3;
        RegisterPanel.X3.setText("X3:{" + X3 + "}");
    }

    public static long getX4() {
        return X4;
    }

    public static void setX4(long x4) {
        X4 = x4;
        RegisterPanel.X4.setText("X4:{" + X4 + "}");
    }

    public static long getX5() {
        return X5;
    }

    public static void setX5(long x5) {
        X5 = x5;
        RegisterPanel.X5.setText("X5:{" + X5 + "}");
    }

    public static long getX6() {
        return X6;
    }

    public static void setX6(long x6) {
        X6 = x6;
        RegisterPanel.X6.setText("X6:{" + X6 + "}");
    }

    public static long getX7() {
        return X7;
    }

    public static void setX7(long x7) {
        X7 = x7;
        RegisterPanel.X7.setText("X7:{" + X7 + "}");
    }

    public static long getX8() {
        return X8;
    }

    public static void setX8(long x8) {
        X8 = x8;
        RegisterPanel.X8.setText("X8:{" + X8 + "}");
    }

    public static long getX9() {
        return X9;
    }

    public static void setX9(long x9) {
        X9 = x9;
        RegisterPanel.X9.setText("X9:{" + X9 + "}");
    }

    public static long getX10() {
        return X10;
    }

    public static void setX10(long x10) {
        X10 = x10;
        RegisterPanel.X10.setText("X10:{" + X10 + "}");
    }

    public static long getX11() {
        return X11;
    }

    public static void setX11(long x11) {
        X11 = x11;
        RegisterPanel.X11.setText("X11:{" + X11 + "}");
    }

    public static long getX12() {
        return X12;
    }

    public static void setX12(long x12) {
        X12 = x12;
        RegisterPanel.X12.setText("X12:{" + X12 + "}");
    }

    public static long getX13() {
        return X13;
    }

    public static void setX13(long x13) {
        X13 = x13;
        RegisterPanel.X13.setText("X13:{" + X13 + "}");
    }

    public static long getX14() {
        return X14;
    }

    public static void setX14(long x14) {
        X14 = x14;
        RegisterPanel.X14.setText("X14:{" + X14 + "}");
    }

    public static long getX15() {
        return X15;
    }

    public static void setX15(long x15) {
        X15 = x15;
        RegisterPanel.X15.setText("X15:{" + X15 + "}");
    }

    public static long getX16() {
        return X16;
    }

    public static void setX16(long x16) {
        X16 = x16;
        RegisterPanel.X16.setText("X16:{" + X16 + "}");
    }

    public static long getX17() {
        return X17;
    }

    public static void setX17(long x17) {
        X17 = x17;
        RegisterPanel.X17.setText("X17:{" + X17 + "}");
    }

    public static long getX18() {
        return X18;
    }

    public static void setX18(long x18) {
        X18 = x18;
        RegisterPanel.X18.setText("X18:{" + X18 + "}");
    }

    public static long getX19() {
        return X19;
    }

    public static void setX19(long x19) {
        X19 = x19;
        RegisterPanel.X19.setText("X19:{" + X19 + "}");
    }

    public static long getX20() {
        return X20;
    }

    public static void setX20(long x20) {
        X20 = x20;
        RegisterPanel.X20.setText("X20:{" + X20 + "}");
    }

    public static long getX21() {
        return X21;
    }

    public static void setX21(long x21) {
        X21 = x21;
        RegisterPanel.X21.setText("X21:{" + X21 + "}");
    }

    public static long getX22() {
        return X22;
    }

    public static void setX22(long x22) {
        X22 = x22;
        RegisterPanel.X22.setText("X22:{" + X22 + "}");
    }

    public static long getX23() {
        return X23;
    }

    public static void setX23(long x23) {
        X23 = x23;
        RegisterPanel.X23.setText("X23:{" + X23 + "}");
    }

    public static long getX24() {
        return X24;
    }

    public static void setX24(long x24) {
        X24 = x24;
        RegisterPanel.X24.setText("X24:{" + X24 + "}");
    }

    public static long getX25() {
        return X25;
    }

    public static void setX25(long x25) {
        X25 = x25;
        RegisterPanel.X25.setText("X25:{" + X25 + "}");
    }

    public static long getX26() {
        return X26;
    }

    public static void setX26(long x26) {
        X26 = x26;
        RegisterPanel.X26.setText("X26:{" + X26 + "}");
    }

    public static long getX27() {
        return X27;
    }

    public static void setX27(long x27) {
        X27 = x27;
        RegisterPanel.X27.setText("X27:{" + X27 + "}");
    }

    public static long getX28() {
        return X28;
    }

    public static void setX28(long x28) {
        X28 = x28;
        RegisterPanel.X28.setText("X28:{" + X28 + "}");
    }

    public static long getX29() {
        return X29;
    }

    public static void setX29(long x29) {
        X29 = x29;
        RegisterPanel.X29.setText("X29:{" + X29 + "}");
    }

    public static long getX30() {
        return X30;
    }

    public static void setX30(long x30) {
        X30 = x30;
        RegisterPanel.X30.setText("X30:{" + X30 + "}");
    }

    public static long getX31() {
        return X31;
    }
    private static void setX31(long x31){
        X31 = x31;
        RegisterPanel.X31.setText("X31:{" + X31 + "}");
    }
    public static void initRegisters(){
        for(int i = 0; i < 32; i++) {
            try {
                Method method = Registers.class.getDeclaredMethod("setX"+i, long.class);
                method.invoke(null,0L);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


}
