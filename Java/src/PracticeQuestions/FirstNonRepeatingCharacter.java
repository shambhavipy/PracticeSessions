package PracticeQuestions;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        int i,j;
        String s = "geeksforgeeks";
        int count=0;
        for(i=0; i< s.length(); i++ ) {
            for(j=0; j< s.length(); j++) {
              if(i!=j && s.charAt(i)==s.charAt(j)) {
                  System.out.println(s.charAt(i));
              }

            }
        }

    }
}
