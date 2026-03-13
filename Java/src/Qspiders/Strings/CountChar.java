package Qspiders.Strings;

/*
count
0 1 2 3 4 5 6 7 ..... 25
0 0 1 0 2 0 0 1 0 0 0 0
 */

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void vcCount(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i]>0) {
                System.out.println((char)(i + 'a') + ": " + count[i]);
            }
        }
    }

    public static void CountCharacters(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++) {

            count.merge(s.charAt(i), 1, Integer::sum);
        }

        System.out.println(count);
    }

    static void main() {
        String s = "vivek";
        CountCharacters(s);
    }
}
