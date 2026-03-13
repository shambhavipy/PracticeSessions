package Qspiders.Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void InsertSort(int[] a) {
        int i, j;
        for (i = 1; i < a.length; i++) {
            int key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] >= key) {
                     a[j+1]=a[j];
                     j--;
            }
            a[j+1]=key;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 6, 5, 2, 1};
        InsertSort(a);
    }
}
