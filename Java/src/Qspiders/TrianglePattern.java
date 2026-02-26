package Qspiders;

public class TrianglePattern {
    static void trianglepattern() {
        int[][] arr = new int[5][9];
        int count = 4;
        for (int i = 0; i < 5; i++) {
            int skip = count;
            while (skip > 0) {
                System.out.print(" ");
                skip--;
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println(                                      );
            count--;
        }
    }

    public static void main() {
        trianglepattern();
    }
}
