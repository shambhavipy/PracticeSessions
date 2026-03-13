package Qspiders.ExceptionHandling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        m1();
        System.out.println("Main Ends");
    }

    public static void m1() {
        System.out.println("M1()-start");
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Handled");
        }

        System.out.println("M1()-end");
    }
    public static void m2() {

        System.out.println("M2()-start");
        try {
            System.out.println(10 / 0);
        }
        finally {
            System.out.println("M2()-end");
        }

    }
}

/*
main : m1 : m2
 */
