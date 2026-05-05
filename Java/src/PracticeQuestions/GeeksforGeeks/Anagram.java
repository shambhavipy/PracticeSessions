package PracticeQuestions.GeeksforGeeks;
import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        LinkedHashMap<Character,Integer> hm1 = new LinkedHashMap<Character,Integer>();
        LinkedHashMap<Character,Integer> hm2 = new LinkedHashMap<Character,Integer>();
        for(char ch : s1.toCharArray()){
            if(hm1.containsKey(ch)){
                hm1.put(ch,hm1.get(ch)+1);
            } else {
                hm1.put(ch,1);
            }
        }
        for(char ch : s2.toCharArray()){
            if(hm2.containsKey(ch)){
                hm2.put(ch,hm2.get(ch)+1);
            } else {
                hm2.put(ch,1);
            }
        }
        if(hm1.equals(hm2)){
            return true;
        } else {
            return false;
        }
    }

    static void main() {
     String s1= "geeks";
     String s2= "kseeg";
        System.out.println(areAnagrams(s1,s2));
    }
}
