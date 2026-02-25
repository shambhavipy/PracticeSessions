package Qspiders;

public class Automorphic {
    public static void main(String[] args) {
        boolean flag;
        int num=7, i , j, sq;
        sq=num*num;
        while(num>0) {
            if(num%10 != sq%10){
                flag = false;
                System.out.println("Number is not an Automorphic");
                break;
            } else
                num = num/10;
                sq = sq/10;
            System.out.println("Number is an Automorphic");
        }


    }
}
