package PracticeQuestions;

    public class rotateArrayByd {
        public static void RotateArrayByd(int[] arr,int d) {
            d=d%arr.length;
            if(d<0) {
                System.out.println("wrong rotation");
            }
            reverseArray(arr, 0,d-1);
            reverseArray(arr, d, arr.length-1);
            reverseArray(arr, 0, arr.length-1);
            for(int i =0; i<= arr.length-1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static int[] reverseArray(int[] arr, int start, int end) {

           while (start<end) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end]= temp;
               start++;
               end--;
           }
           return arr;
        }

        public static void main(String[] args) {
            int[] arr = new int[] {1,2,3,4,5};
            RotateArrayByd(arr, 2);
        }


    }
