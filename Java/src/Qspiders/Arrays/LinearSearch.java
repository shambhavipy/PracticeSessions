package Qspiders.Arrays;

public class LinearSearch {
    public int lsearch(int[]arr, int k) {
        int i,j = 0;
        for(i=0; i< arr.length; i++) {
            if(arr[i]==k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,9};
        LinearSearch ls = new LinearSearch();
        int key=5;
        System.out.println("index of key is " + ls.lsearch(arr, key));
    }
}
