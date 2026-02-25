package PracticeQuestions;

public class whileloop {

    public static void main() {
        int i=1 ,n =123, sum=0;
        while(n>0) {
            sum = sum+(n%10);
            n=n/10;
            i++;
        }
        System.out.println(sum);
    }

}
