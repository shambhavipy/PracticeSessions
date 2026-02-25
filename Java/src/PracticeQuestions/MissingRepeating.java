package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingRepeating {

    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        HashSet<Integer> duplicates = new HashSet<>();

        int dup_num = -1;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (long) arr[i];
            boolean res = duplicates.add(arr[i]);
            if (!res) {
                dup_num = arr[i];
            }
        }

        long actualSum = ((long) n * (n + 1)) / 2;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(dup_num);
        result.add((int) (actualSum - (sum - dup_num)));

        return result;
    }

    public static void main() {
        int arr[] = new int[]{4, 3, 6, 2, 1, 1};
        MissingRepeating mr = new MissingRepeating();
        System.out.println(mr.findTwoElement(arr));
    }
}
