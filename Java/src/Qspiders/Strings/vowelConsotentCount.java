package Qspiders.Strings;

public class vowelConsotentCount {

    public static void vcCount(String S) {
        int vowel=0, consonent=0;
        for (int j = 0; j < S.length(); j++) {
            char ch = S.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            else {
                consonent++;
            }
        }
        System.out.println("Vowels are " + vowel);
        System.out.println("Consonents are " + consonent);
    }

    static void main() {
        String s = "Shambhavi";
        vcCount(s);
    }
}
