package PracticeQuestions;

import java.util.Arrays;

public class TwoSum {
    static boolean twoSum(int arr[], int target) {
        int i=0, j=arr.length-1;
        Arrays.sort(arr);
        while(i<j) {
            int sum =arr[i]+arr[j];
            if(target == sum) {
                return true;
            } else if (target > sum) {
                i++;
            } else j--;
        }
        return false;
    }

    public static void main() {
        int arr[] = {0, -1, 2, -3, 1};
        int t = -2 ;
        System.out.println(TwoSum.twoSum(arr, t));
    }
}
