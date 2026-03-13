package Qspiders.Arrays;

public class SumArray {
    SumArray(int[] a) {
        int i, sum=0;
        for(i=0; i<a.length; i++) {
            sum =sum+a[i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int[] a = new int[]{7, 6, 2, 3, 9};
        SumArray sa = new SumArray(a);
    }
}
