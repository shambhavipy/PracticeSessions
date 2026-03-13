package Qspiders.Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        int[] b = {100,200,300,400,500,600};
        System.arraycopy(a,0,b,1,4);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
