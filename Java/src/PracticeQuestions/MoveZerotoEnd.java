package PracticeQuestions;

public class MoveZerotoEnd {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 0, 4, 3, 0, 5, 0};
        int nonz=0 ;
        int z=0 ;
        int temp;
        int size= arr.length;

        while(nonz< arr.length) {
            if(arr[nonz]!=0) {
                temp = arr[nonz];
                arr[nonz] = arr[z];
                arr[z]=temp;
                nonz++;
                z++;
            }
            else
                nonz++;

            }
        for(int i =0; i<size; i++) {
            System.out.print(arr[i]);
        }

        }


}

