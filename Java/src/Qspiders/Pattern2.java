package Qspiders;

public class Pattern2 {
    static void trianglepattern() {
        int i,j;
        for(i=5; i>=0; i--) {
            for(j=0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main() {
        trianglepattern();
    }
}
