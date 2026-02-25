package Qspiders;

public class PerfectNum {
    public static void main() {
        int sum = 0, div = 1, n = 6;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("Number is a perfect number");
        } else
            System.out.println("Number is not a perfect number");
    }
}
