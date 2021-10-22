package legv8gui.examples;

public class HelloWorld {
    public static String getCode()  {
        return "ADDI x0, x31, #72\n" +
                "STUR x0, [x31, #0]\n" +
                "ADDI x0, x31, #101\n" +
                "STUR x0, [x31, #8]\n" +
                "ADDI x0, x31, #108\n" +
                "STUR x0, [x31, #16]\n" +
                "ADDI x0, x31, #108\n" +
                "STUR x0, [x31, #24]\n" +
                "ADDI x0, x31, #111\n" +
                "STUR x0, [x31, #32]\n" +
                "ADDI x0, x31, #87\n" +
                "STUR x0, [x31, #40]\n" +
                "ADDI x0, x31, #111\n" +
                "STUR x0, [x31, #48]\n" +
                "ADDI x0, x31, #114\n" +
                "STUR x0, [x31, #56]\n" +
                "ADDI x0, x31, #108\n" +
                "STUR x0, [x31, #64]\n" +
                "ADDI x0, x31, #100\n" +
                "STUR x0, [x31, #72]\n";
    }
}
