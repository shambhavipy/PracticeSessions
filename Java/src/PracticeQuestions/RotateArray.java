package PracticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {
    String name;
    int age;
    static int num;

    public boolean SetNameAndAge(String sdnkjfn, int dfjkgef) {
        this.name = sdnkjfn;
        this.age = dfjkgef;

        return false;
    }

    public void PrintNameAndAge() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    static void rotateArr(int arr[], int d) {
        int n= arr[d];
        int arr2[] = new int[arr.length];
        int i,j;
        for(i=0; i<d; i++) {
            for (j=2; j<arr.length;j++) {
                arr2[i] = arr[j];
            }
            System.out.println(arr2[j]);
        }
        for(int z=0; z<arr2.length; z++) {
            System.out.print(arr2[z]);
        }
    }

    public static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        RotateArray ra = new RotateArray();

        boolean integers;
        rotateArr(arr, 2);
    }
}
