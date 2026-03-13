package Qspiders.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void selectsort(int[] a) {
        for(int i = 0; i< a.length-1; i++) {
            int snum = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[j]<a[snum]) {
                   snum= j;
                }
            }
            int temp;
            temp = a[i];
            a[i] = a[snum];
            a[snum] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,2,7,3};
        selectsort(arr);
    }
}
