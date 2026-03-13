package Qspiders.Strings;

public class RemoveDuplicates {
    public static void RemoveDuplicates(String s) {
        int i, j;
        String st = "";
        char[] ch = s.toCharArray();
        for (i = 0; i < ch.length; i++) {
            if(ch[i]==' ') continue;
            for(j=i+1; j<ch.length; j++) {
                if(ch[i]==ch[j]) {
                    ch[j]=' ';
                }
            }
            st+=ch[i];
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        String s = "aabbcd";
        RemoveDuplicates(s);
    }
}
