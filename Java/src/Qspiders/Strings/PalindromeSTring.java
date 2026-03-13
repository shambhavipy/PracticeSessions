package Qspiders.Strings;

public class PalindromeSTring {
    static void main() {
        String s = "ABAC";
        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("Given String is a palindrome");
        } else System.out.println("Given String is not a palindrome");
    }
}
