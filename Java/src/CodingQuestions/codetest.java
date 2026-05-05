package CodingQuestions;

import java.util.HashMap;

public class codetest {
        public static void frequency(String s) {

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for(char c : s.toCharArray()){
                if(map.containsKey(c)) {
                    map.put(c, map.getOrDefault(c,0)+1);
                } else {
                    map.put(c,0);
                }
            }
            System.out.println(map);

        }
        public static void main(String[] args) {
            String s = "Shambhavi";
            frequency(s);
        }
    }

