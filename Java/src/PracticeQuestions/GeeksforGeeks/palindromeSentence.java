package PracticeQuestions.GeeksforGeeks;

public class palindromeSentence {
    public static boolean Palindrome(String s) {
        boolean sentence = true;
        String s1 = s.toLowerCase();
        String s2 = s1.toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        int i =0, j = s2.length()-1;
        while(i<j) {
            if(s2.charAt(i)==' '){
                i++;
            } else if (s2.charAt(j)==' '){
                j--;
            } else if (s2.charAt(i)!=s2.charAt(j)) {
                sentence = false;
                break;
            }
            i++;
            j--;
        }
        return sentence;
    }

    public static void main(String[] args) {
        String s = "Too hot to Hoot";

        System.out.println(Palindrome(s));
    }
}
