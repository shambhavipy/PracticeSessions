package Qspiders;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i=0, j=1,k;
        for(int a=1; a<10; a++) {
            System.out.print(i + " ");
            k= i+j;
            i=j;
            j=k;
        }
    }
}
