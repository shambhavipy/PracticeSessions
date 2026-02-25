package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public static void revarr(int[] arr) {
        int i, temp, k;
        k = arr.length;

        for (i = 0; i < k/2; i++) {
            temp = arr[i];
            arr[i] = arr[(k) - i-1];
            arr[(k-1) - i] = temp;

        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        int i;
        revarr(arr);
        for(i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
