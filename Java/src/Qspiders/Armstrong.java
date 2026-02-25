package Qspiders;

public class Armstrong {
    public static void main(String[] args) {
        int i, j, n = 153, sum = 0, temp=n;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum = sum + d * d * d;
        }
        if (sum == temp) {
            System.out.println("number is an armstrong");
        } else
            System.out.println("number is not an armstrong");


    }
}
