package PracticeQuestions;

import java.util.Arrays;

public class SecondLargestArray {

    static int secondlargest(int[] arr) {
        int n = arr.length;
        int r = -1;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--) {
            if(arr[i]!=arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }
   public static void main(String[] args) {

        int[] arr = {10,10,10};
        System.out.println(secondlargest(arr));
    }

}
