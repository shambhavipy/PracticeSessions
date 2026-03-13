package Qspiders.Arrays;

import java.util.Arrays;

public class EvenNumber {
    EvenNumber(int[] a) {
        int i,num,sumeven=0, sumodd=0;

        for(i=0; i<a.length; i++) {
            num=a[i]%2;
            if(num==0) {
                sumeven = sumeven+a[i];
            }
            else {
                sumodd = sumodd+a[i];
            }
        }
        System.out.println("Sum of even numbers is " + sumeven );
        System.out.println("Sum of odd numbers is " + sumodd);
    }
    public static void main(String[] args) {
        int[] a = new int[]{7,6,2,3,9};
        EvenNumber even = new EvenNumber(a);
    }
}
