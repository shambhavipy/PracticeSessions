package PracticeQuestions;

import java.util.Arrays;

public class ThreeCandidates {

    int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(arr[0]>0 || arr[1]>0) {
            return arr[n-1]*arr[n-2]*arr[n-3];
        }
        if(arr[n-2]<0 || arr[n-3]<0) {
            return  arr[0]*arr[1]*arr[n-1];
        }
        return Math.max(arr[0]*arr[1], arr[n-2]*arr[n-3])*arr[n-1];
    }

    public static void main(String[] args0) {

        int[] arr = {852, -566, 182, -638, -693, -323};
        ThreeCandidates tc = new ThreeCandidates();
        System.out.println(tc.maxProduct(arr));

    }
}
