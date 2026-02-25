package PracticeQuestions;

public class Reverseastring {
    static String reverseWithSpacesIntact(String S) {
        char[] str = S.toCharArray();
        char temp;
        int start = 0, end = str.length-1;
        while (start < end) {
            if (str[start] == ' ') {
                start++;
            } else if (str[end] == ' ') {
                end--;
            } else {
                temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }

    return String.valueOf(str);
    }


    public static void main() {
        String s = "geeksforgeeks";
        System.out.println(Reverseastring.reverseWithSpacesIntact(s));
    }
}
