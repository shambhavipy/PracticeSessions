package PracticeQuestions.GeeksforGeeks;

import java.util.Arrays;

public class PaitWithDifference {
    public boolean findPair(int[] arr, int x) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            int findNum = arr[i]+x;
            boolean res = binarySearchNum(arr, i+1, arr.length-1, findNum);
            if(res) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearchNum(int[] arr, int start, int end, int target) {
        while(start<=end) {
            int mid = (start+end)/2;

            if(arr[mid]>target) {
                end=mid-1;
            } else if(arr[mid]<target) {
                start=mid+1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main() {
        int[] arr = new int[]{93, 43, 23, 87, 65, 1, 88, 61, 14, 75, 71, 71, 36, 34, 12, 61, 97, 68, 86, 51, 41, 95, 96, 25, 20, 26, 77, 95, 59, 3, 72, 67};
        PaitWithDifference pd = new PaitWithDifference();
        System.out.println(pd.findPair(arr, 93));
    }
}
