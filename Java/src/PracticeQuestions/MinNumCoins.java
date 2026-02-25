package PracticeQuestions;

public class MinNumCoins {

    public int findMin(int n) {
        int count = 0;
        count = count + n / 10;
        int rem = n % 10;
        count =count+ rem / 5;
        rem = rem%5;
        count = count + rem/2;
        rem = rem%2;

        return count+rem;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 10};
        int n = 121;
        MinNumCoins Mn = new MinNumCoins();
        System.out.println(Mn.findMin(n));
    }
}
