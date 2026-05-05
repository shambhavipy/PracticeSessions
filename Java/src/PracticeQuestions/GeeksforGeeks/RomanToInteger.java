package PracticeQuestions.GeeksforGeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class RomanToInteger {
    public static int romanToDecimal(String s) {

        Map<Character, Integer> lhm = new HashMap<Character, Integer>();
        lhm.put('I', 1);
        lhm.put('V', 5);
        lhm.put('X', 10);
        lhm.put('L', 50);
        lhm.put('C', 100);
        lhm.put('D', 500);
        lhm.put('M', 1000);

        int total = 0;

        if(s.length()==1){
            return  lhm.get(s.charAt(0));
        }

        int i = 0;
        for (i = 0; i < s.length(); i++) {
            Integer current = lhm.get(s.charAt(i));
            Integer next = lhm.get(s.charAt(i + 1));
            if (current < next) {
                total = total + next - current;
                i++;

                if(i == s.length()-2 ){
                    total=total+lhm.get(s.charAt(i+1));
                }
            } else {
                if(i+1 ==s.length()-1) {
                    total= total+next;
                }
                total = total + current;
            }
        }



        return total;

    }

    static void main() {
        String s = "II";

        System.out.println(romanToDecimal(s));
    }
}
