package Qspiders.ExceptionHandling;

public class FinallyUseCase {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        System.out.println("DB-Open");
        try{
            System.out.println(10/2);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled");
        } finally {
            System.out.println("DB-closed");
        }
        System.out.println("Main ends");
    }
}
