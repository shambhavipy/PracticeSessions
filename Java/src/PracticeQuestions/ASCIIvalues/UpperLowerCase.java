package PracticeQuestions.ASCIIvalues;

public class UpperLowerCase {
    public static void main(String[] args) {
        char a = '$';
        if(a>=65 && a<=90) {
            System.out.println("Uppercase");
        } else if (a>=97 && a<=122) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Letter is invalid");
        }

    }
}
