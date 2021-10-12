package legv8gui.util;

public class BinaryUtils {
    public static long parseBinary(String num){
        long mod = 1;
        long total = 0;
        long temp;
        for(int i = 0; i < num.length();i++){
            temp = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
            total += temp*mod;
            mod = mod*2;
        }

        return total;
    }
    public static long parseBinaryBranch(String num){
        String tempnum = "";
        boolean neg = false;
        if(num.charAt(0) == '1') {
            neg = true;
            for(int i = 0; i < num.length();i++) {
                if(num.charAt(i) == '1') {
                    tempnum+='0';
                }else {
                    tempnum+='1';
                }
            }
            num = tempnum;
        }
        long mod = 1;
        long total = 0;
        long temp;
        for(int i = 0; i < num.length();i++){
            temp = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
            total += temp*mod;
            mod = mod*2;
        }
        if(neg) {
            total++;
            total = total*-1;
        }
        return total;
    }
    public static byte parseBinaryByte(String num){
        int mod = 1;
        byte total = 0;
        int temp;
        for(int i = 0; i < num.length();i++){
            temp = Integer.parseInt(num.substring(num.length()-i-1,num.length()-i));
            total += temp*mod;
            mod = mod*2;
        }
        return total;
    }
}
