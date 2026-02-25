package Qspiders;

public class WhileMulti {

    public static void main() {
        int n =1234, prod=1,sum=0;
        while(n>0) {
            prod = prod * (n%10);
            sum = sum + (n%10);
            n=n/10;
        }
        if(prod==sum) {
            System.out.println("Number is spy");
        } else
            System.out.println("Number is not a spy");
    }
}
