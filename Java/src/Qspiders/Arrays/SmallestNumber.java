package Qspiders.Arrays;

public class SmallestNumber {
    SmallestNumber(int[] a){
        int i;
        int j=a[0];
        for(i=1; i<a.length; i++) {
            if(a[i]>j) {
                i++;
            } else {
                j=a[i];
            }
        }
        System.out.println("Smallest number is " + j);
    }
    public static void main(String[] args) {
        int[] a = new int[]{7,6,2,3,9};
        SmallestNumber SM = new SmallestNumber(a);
    }
}
