package Qspiders.Strings;

public class countString2 {
    static void main() {
        String s = "AaBbCc1@2Dd5#";
        String uc = "";
        String lc = "";
        String num = "";
        String sp = "";
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch<='Z') {
                uc= uc+ch;
            } else if (ch>= 'a' && ch<= 'z') {
                lc = lc+ch;
            } else if (ch>='0' && ch<='9') {
                num = num+ch;
            } else
                sp = sp+ch;
        }
       System.out.println(uc+lc+num+sp);
    }
}
