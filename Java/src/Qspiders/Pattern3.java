package Qspiders;

public class Pattern3 {
    static void hollowtriangle() {
        int i, st = 1, n =7 ;
        int sp = n-1;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            sp--;
            st += 2;
        }
    }

    public static void main() {
        hollowtriangle();
    }
}
