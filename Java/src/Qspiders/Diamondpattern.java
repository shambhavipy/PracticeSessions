package Qspiders;

public class Diamondpattern {
    static void diamondpattern() {
        int n=9;
        int sp= n/2;
        int st = 1;
        if(n%2==0) {
            n=n+1;
        }
        for(int i=1; i<=n; i++) {
            for(int j =1; j<=sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if(j==1||j==st) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i <= n / 2) {
                sp--;
                st+=2;
            } else {
                sp++;
                st-=2;
            }
        }
    }
    public static void main(String[] args) {
        diamondpattern();
    }
}
