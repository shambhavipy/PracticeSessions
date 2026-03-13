package Qspiders.Arrays;

import java.util.Arrays;

public class Demo1 {
    public static void m1(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(Arrays.toString(a));
        m1(a);
        System.out.println(Arrays.toString(a));
    }
}
