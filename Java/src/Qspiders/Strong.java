package Qspiders;

public class Strong {
    public static void main(String[] args) {
        int num, i = 145, j, sum = 0, strongnum=145;

        while (i > 0) {
            num = i % 10;
            int fact=1;
            for (j = 1; j <= num; j++) {
                fact = fact * j;
            }
            i = i / 10;
            sum = sum + fact;
        }
        if (strongnum== sum) {
            System.out.println("Number is a strong number");
        } else System.out.println("Number is not a strong number");

    }
}
