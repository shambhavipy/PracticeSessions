package Qspiders.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bsort(int[] ar) {
        int i, j;
        for (i = 0; i < ar.length-1 ; i++) {
            for (j = 0; j < (ar.length - 1)-i; j++) {
                int temp=0;
                if(ar[j]>ar[j+1]) {
                    temp =  ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    static void main() {
        int[] a = new int[]{6,9,2,5,4,1};
        bsort(a);
    }
}
