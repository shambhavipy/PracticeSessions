package CoreJava;

public class exceptionDemo {



    public static void main(String[] args) {
    int a=4;
    int b=7;
    int c=0;
    int arr[] = new int[]  {6,7,8,9};
     try {
           // int k =b/c;
            System.out.println(arr[5]);

        }
        catch(ArithmeticException exp) {
            System.out.println("Arithmetic Exception");
        }

        catch (IndexOutOfBoundsException ex) {
            System.out.println("Index Out Of Bound Exception catched successfully");
        }
        catch(Exception e) {

            System.out.println("I catched the error exception");

        }









    }
}
