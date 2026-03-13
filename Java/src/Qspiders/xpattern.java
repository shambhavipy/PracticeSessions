package Qspiders;

public class xpattern {
    static void xpattern() {
        int n=10,i,j;
       if(n%2==0) {
            n= n+1;
        }
        for(i=1; i<=n ; i++) {
            for(j=1; j<=n; j++) {
                if(i==j || i+j==n+1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main() {
        xpattern();
    }
}
