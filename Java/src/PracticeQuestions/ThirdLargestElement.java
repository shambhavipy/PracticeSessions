package PracticeQuestions;

import java.util.Arrays;

  class ThirdLargestElement {

    private static void TLR() {
        System.out.println("odbfib");
    }

    public static int TLR(int[] arr) {
        int l=arr.length;
        int n;
        Arrays.sort(arr);

        for(n=l-3;n>=0;n--) {
            if(arr[n]!=arr[l-3]){
                return arr[l-3];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {855,450,132, 359, 233, 825, 604, 481, 262, 337, 720, 525, 652, 300, 906, 219, 926, 906 ,293 ,864, 817 ,498, 30 ,639 ,661
        };


    }
}
