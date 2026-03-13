package Qspiders.Strings;

public class vowel {
    public static void main() {
        String s = "Shambhavi";
        int j;
        int vowel = 0;
        for(j=0; j<s.length(); j++) {
            char ch = s.charAt(j);
            if(ch=='i' || ch=='a' || ch=='e' || ch=='o' || ch=='u') {
                vowel++;
            }
        }
        System.out.println("vowel " + vowel);
    }
}
