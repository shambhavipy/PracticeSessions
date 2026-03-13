package Qspiders.ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        int[] a = {1,2,3};
        try {
            System.out.println("Outer Try-Block-1");
            try {
                System.out.println("Inner Try-Block-1");
                System.out.println(a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner-Catch-Block-1");
            }
        } catch (Exception e) {
            System.out.println("Outer Catch");
        }
        System.out.println("Main end");
    }
}
