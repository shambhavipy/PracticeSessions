package Qspiders.Arrays;

public class SecondSmallest {
    public static void secsml(int[] a) {
        int i, j, k = 0;
        int s2 = a[0];
        int s1 = a[0];
        for (i = 1; i < a.length; i++) {
            if (a[i] < s1) {
                s2 = s1;
                s1 = a[i];
            } else if (a[i]<s2) {
                s2=a[i];
            }
        }
        System.out.println(s1 + "," + s2);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 2, 5, 4, 1};
        secsml(arr);

    }
}
