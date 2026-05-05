package PracticeQuestions.GeeksforGeeks;

import java.util.Arrays;

public class maxPerimeter {
    public static int maxPerimeter(int[] arr) {
        // code here
        Arrays.sort(arr);
        int result=0;
        for(int i = arr.length-1; i>2; i--){
            int a =arr[i];
            int b =arr[i-1];
            int c =arr[i-2];
            int target = 0;
            if((a+b)>c && (b+c)>a){
              target = a+b+c;
            }
            if(target>result) {
                result = target;
            } else
                target = -1;
                return target;
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr = new int[]{7, 55, 20, 1, 4, 33, 12};
        System.out.println(maxPerimeter(arr));
    }
}
