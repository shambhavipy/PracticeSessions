package Qspiders.Strings;

public class InitiCap {
    public static void FirstLetterCaps(String s) {
        char[] ch = s.toCharArray();
        int i;
        for (i = 0; i < ch.length; i++) {
            if(ch[i]>='A' && ch[i]<='Z') {
                i++;
            }
            if (i == 0 || ch[i-1] == ' ') {
                ch[i]-=32;
            }

        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        String s = "java Is easy";
        FirstLetterCaps(s);
    }
}
