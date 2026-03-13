package Qspiders.Strings;

public class vowelCount {
    static void main() {
        String s = "Shambhavi";
        int j;
        int vowel=0;
        int a =0, e = 0, i =0, o=0, u=0;
        for(j=0; j<=s.length()-1; j++) {
            char ch = s.charAt(j);
            if(ch=='a') {
                a++;
            } else if (ch=='e') {
                e++;
            } else if (ch=='i') {
                i++;
            } else if (ch=='o') {
                o++;
            } else if (ch=='u') {
                u++;
            }
        }
        System.out.println("a " + a);
        System.out.println("e " + e);
        System.out.println("i " + i);
        System.out.println("o " + o);
        System.out.println("u " + u);
    }
}
