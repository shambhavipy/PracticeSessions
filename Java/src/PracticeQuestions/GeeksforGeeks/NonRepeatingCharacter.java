package PracticeQuestions.GeeksforGeeks;

import java.util.*;

public class NonRepeatingCharacter {
    public char nonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
        char[] stringArray = s.toCharArray();
        for (char c : stringArray) {
            if (lh.containsKey(c)) {
                lh.put(c, lh.get(c) + 1);
            } else {
                lh.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry:lh.entrySet()){
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        NonRepeatingCharacter nrc = new NonRepeatingCharacter();
        System.out.println(nrc.nonRepeatingChar(s));
    }
}
