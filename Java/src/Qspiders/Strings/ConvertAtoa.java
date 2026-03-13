package Qspiders.Strings;

public class ConvertAtoa {
    public static void Convertchar(String s) {
        char[] ch = s.toCharArray();
        int i;
        for(i=0; i<ch.length; i++) {
            if(ch[i]>= 'A' && ch[i] <= 'Z') {
                ch[i]+=32;
            } else {
                ch[i]-=32;
            }
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String s = "AaBbCcaA";
        Convertchar(s);
    }
}
