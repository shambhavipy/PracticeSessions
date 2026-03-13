package Qspiders.Strings;

public class JavaIsEasy {
    public static void reversestring(String s) {
        int i=s.length()-1,j=s.length()-1;
        String S2 = "";
        while(j>=0) {
            while(j>=0 && s.charAt(j)!=' ') {
                j--;
            }
            int k = j+1;
            while(k<=i) {
                S2=S2+s.charAt(k);
                k++;
            }
            if(j>=0) {
                S2=S2+ " ";
                j--;
                i=j;
            }

        }
        System.out.println(S2);
    }
    public static void main(String[] args) {
        String s = "Java is easy";
        reversestring(s);
    }
}
