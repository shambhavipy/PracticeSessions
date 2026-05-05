package CodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class Dchar {
    static void main() {

        String str = "programming";
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.print(ch);
            }
        }
    }
}
