package Qspiders;

public class Pattern1 {
        static void trianglepattern() {
         int i,j;
         for(i=1; i<=5; i++) {
             for(j=1; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println("  ");
         }
        }

    public static void main(String[] Shambhavi) {
        trianglepattern();
    }
}
