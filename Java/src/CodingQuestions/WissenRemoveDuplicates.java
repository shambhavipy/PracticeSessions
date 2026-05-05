package CodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class WissenRemoveDuplicates {
    public static void main() {
        String s = "Shhhhhhhhhhhambhaaaaavvvviiiiii";

        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for(char c : s.toCharArray()) {
            hs.add(c);
        }

        ArrayList<Character> al = new ArrayList<>(hs);
        System.out.println(al);

    }
}
