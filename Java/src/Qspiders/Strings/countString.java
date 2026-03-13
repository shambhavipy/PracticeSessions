package Qspiders.Strings;

public class countString {
    public static void main() {
        String s = "AaBbCc1@2Dd5#";
        int uc = 0, lc = 0, num = 0, sp = 0, i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uc++;
            } else if (ch >= 'a' && ch <= 'z') {
                lc++;
            } else if (ch>='0' && ch<='9') {
                num++;
            } else {
                sp++;
            }
        }
        System.out.println("uc is " + uc + "lc is " + lc + "number is " + num + "sp is " + sp);
    }
}
