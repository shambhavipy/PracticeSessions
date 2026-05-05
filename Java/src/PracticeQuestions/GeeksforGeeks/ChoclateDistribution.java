package PracticeQuestions.GeeksforGeeks;

import java.util.ArrayList;
import java.util.Collections;

public class ChoclateDistribution {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);

        int start=0, end=m-1, res=Integer.MAX_VALUE;
        while(end<arr.size()) {
            int target = arr.get(end)-arr.get(start);
            if(target<res) {
                res = target;
            }
            start++;

            end++;
        }

        return res;
    }

public static void main() {
    int[] a = new int[]{3, 4, 1, 9, 56, 7, 9, 12};
    ArrayList<Integer> arr = new ArrayList();
    for(int j : a) {
        arr.add(j);
    }
    System.out.println(ChoclateDistribution.findMinDiff(arr, 5));
    }
}

