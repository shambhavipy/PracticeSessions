package Qspiders.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public void ra(int[] arr) {
        int i, j;
        int temp = 0;
        for (i = arr.length-1; i>=0;  i--) {
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 6, 9};
        ReverseArray r = new ReverseArray();
        r.ra(arr);
    }
}
