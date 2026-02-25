package CoreJava;

import java.util.ArrayList;

public class Amazon {

    public static void main(String[] args) {
        int i,j,k;
        int[] arr = new int[] {4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> al = new ArrayList<>();
        for(i=0; i<arr.length; i++) {
            k=0;
            for(j=i+1; j<arr.length; j++) {
                    if(!al.contains(arr[i])) {
                        al.add(arr[i]);
                        k++;
                    }

            }
            System.out.println(arr[i]);
            System.out.println(k);
        }

    }
}
