package PracticeQuestions.sorting;

import java.util.Arrays;

public class Sstecht {
    public static void SSmethod(int[] a) {
        int i, j, num, temp=0;
        for (i = 0; i < a.length; i++) {
            num = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[num]) {
                    num = j;
                }
            }
            temp = a[i];
            a[i] = a[num];
            a[num] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 2, 7, 3};
        Sstecht ss = new Sstecht();
        SSmethod(arr);
    }
}
