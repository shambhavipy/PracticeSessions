package CodingQuestions;

import java.util.Arrays;

public class GenpactTest {
    //{10,20,5,30,25}
    public static void SecLargest(int[] arr) {
        int i, j;
        for(i =0; i <arr.length-1; i++) {
            for(j =0; j< arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int secondLargest = arr.length-2;
        System.out.println(arr[secondLargest]);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,5,30,25};
        SecLargest(arr);
    }

}
