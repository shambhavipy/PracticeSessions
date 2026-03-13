package Qspiders.Strings;

public class JavaIsEasyReverse {
    public static void StringReverse(String s) {
           int i=0, j=0;
           String s2 = "";
           while(j<s.length()) {
               while(j<s.length() && s.charAt(j)!=' ') {
                   j++;
               }
               int k = j-1;
               while(k>=i) {
                   s2 = s2+s.charAt(k);
                   k--;
               }
               if(j<=s.length()) {
                   s2 = s2+ " ";
                   j++;
                   i=j;
               }
           }
        System.out.println(s2);

    }
    static void main() {
        String s = "Java is easy";
        StringReverse(s);
    }
}
