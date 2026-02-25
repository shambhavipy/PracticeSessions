package Qspiders;

public class Prime {

    public static void main(String[] args){
        int num=4, i;
        boolean flag=true;
        for(i=2; i<=num/2; i++) {
            if(num%i==0) {
                flag = false;
            }
        }
        if(flag==true){
            System.out.println("Number is a prime number");
        } else System.out.println("Number is not a prime number");
    }
}
