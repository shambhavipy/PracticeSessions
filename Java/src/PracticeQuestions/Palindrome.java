package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {


    public static void main(String[] args) {
        String s = "abbc";

        int i=0,
        j= s.length()-1;

        while(i<j) {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("Not a palindrome");
            }
            i++;
            j--;
        }

        }

    }

