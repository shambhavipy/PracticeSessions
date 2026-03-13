package Qspiders.Strings;

public class CountDuplicates {
    public static void RemoveDuplicates(String s) {
        int i, j;
        String st = "";
        char[] ch = s.toCharArray();
        for (i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == ' ') continue;
            for (j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j]=' ';
                }
            }
            System.out.println(ch[i] + ":" +count);
        }


    }

    static void main() {
        String s = "aaabcd";
        RemoveDuplicates(s);
    }
}

