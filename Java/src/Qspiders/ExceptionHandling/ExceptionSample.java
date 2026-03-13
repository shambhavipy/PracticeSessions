package Qspiders.ExceptionHandling;

public class ExceptionSample {
    public static void main(String[] args){
        int age = 7;
        if(age>=18){
            System.out.println("eligible");

        }
        else{
            System.out.println("not eligible");
            throw new AgeInvalidException();
        }

        System.out.println("end");
    }
}
