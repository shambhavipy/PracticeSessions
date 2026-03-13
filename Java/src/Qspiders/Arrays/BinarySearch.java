package Qspiders.Arrays;
public class BinarySearch {
    public void bisearch(int[] arr, int k) {
        int i, j, start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( k==arr[mid]) {
                System.out.println("number is at index " + mid);
                break;
            } else if ( k<arr[mid] ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(end<start) {
                System.out.println("number is not found");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 7, 9, 10, 13, 20, 21, 25, 27};
        int key = 28;
        BinarySearch bs = new BinarySearch();
        bs.bisearch(arr, key);
    }
}
