package PracticeQuestions.GeeksforGeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class subset {
    public static boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

return  true;
    }

    static void main() {
        //int[] a = new int[]{11, 7, 1, 13, 21, 3, 7, 3};
       // int[] b = new int[]{11, 3, 7, 1, 7};

        int[] a = new int[]{1,2,2};
        int[] b = new int[]{1,1};

        boolean bool = isSubset(a, b);
        System.out.println(bool);
    }
}
