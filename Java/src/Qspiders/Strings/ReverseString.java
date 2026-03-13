package Qspiders.Strings;

public class ReverseString {

    public static String reverse(String s) {
        int i;
        String sum = "";
        for (i = s.length()-1; i >= 0; i--) {
            sum = sum + s.charAt(i);
        }
        return sum;
    }

    public static void main() {
        String s = "java";
        System.out.println(reverse(s));
    }
}
