package Qspiders.Strings;

public class Panagram {
    public static void CheckPanagram(String s) {
        s = s.toLowerCase();
        boolean flag = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(ch + "")) {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("Not Panagram");
        } else {
            System.out.println("String is Panagram");
        }

    }

    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
        CheckPanagram(s);
    }
}
