package Qspiders.ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        String s = null;
       // System.out.println(s.length());
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Main end");
    }
}
