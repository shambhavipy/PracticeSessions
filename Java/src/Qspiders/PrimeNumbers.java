package Qspiders;

public class PrimeNumbers {
    static int j;
    int k;
    static boolean pm(int a) {
        int i;
        boolean flag = true;
            for(i=2; i<=a/2; i++) {
                if(a%i==0) {
                    flag = false;
                }
            }
            if (flag == true) {
                return true;
            }
            else return false;

    }

    public static void main() {
        int num;
        System.out.println(pm(5));
    }

}
