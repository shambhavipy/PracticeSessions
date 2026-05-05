package CodingQuestions;

import javax.print.attribute.standard.PresentationDirection;
import java.util.HashMap;
import java.util.Map;

public class Wiprofreq {
    public static String freq(String s, int max) {
        String[] input = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<input.length; i++) {
            HashMap<Character, Integer> freq = new HashMap<>();
            StringBuilder curr = new StringBuilder(input[i]);

            for (char c : curr.toString().toCharArray()) {
                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                } else {
                    freq.put(c, 1);
                }
            }

            for (int j=0; j<curr.length(); j++) {
                if(freq.get(curr.charAt(j)) >= max) {
                    if(isVowel(curr.charAt(j))) {
                        curr.setCharAt(j, '0');
                    } else {
                        curr.setCharAt(j, '1');
                    }
                }
            }

            result.append(curr + " ");
        }

        return result.toString();
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main() {
        String s = "lavleeen haaas attenden ann interrrviewww" ;
        System.out.println(freq(s, 3));
    }
}
