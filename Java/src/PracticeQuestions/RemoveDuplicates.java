package PracticeQuestions;

import java.util.*;

public class RemoveDuplicates {

    ArrayList<Integer> removeDuplicates(int[] arr) {


        HashSet<Integer> hs = new HashSet<Integer>();

        for(int num: arr) {
            hs.add(num);
        }

        ArrayList<Integer> list = new ArrayList<Integer>(hs);
        Collections.sort(list);
        return list;

    }
    public static void main(String[] args) {

        int[] arr = new int[]{10,23,23,27,27,32,37,48,54,66,66,90,91,91};
        RemoveDuplicates RD = new RemoveDuplicates();

        System.out.println(RD.removeDuplicates(arr));
    }
}

