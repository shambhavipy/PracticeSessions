package PracticeQuestions;

import java.util.Arrays;

public class MissingArray {


    public static void main( ) {

        int[] arr = {1,2,3,5};
        long sum1=0;
        long actualsum=0;
        for(int i=0; i< (arr.length); i++) {

                sum1= sum1+(long)arr[i];
        }
        //System.out.println(sum1);
        actualsum = (((long)arr.length+(long)2) * ((long)arr.length+(long)1))/2;
        System.out.println(actualsum-sum1);



    }
}
