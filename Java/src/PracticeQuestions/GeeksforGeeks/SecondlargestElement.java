package PracticeQuestions.GeeksforGeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondlargestElement {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int num = n - 2; num >= 0; num--) {
            if (arr[num] != arr[n - 1]) {
                return arr[num];
            }
        }
        return -1;

    }

    static void main() {
        // int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        int[] arr = new int[]{10, 5, 10};
        SecondlargestElement sec_lag_ele = new SecondlargestElement();
        System.out.println(sec_lag_ele.getSecondLargest(arr));
    }
}


