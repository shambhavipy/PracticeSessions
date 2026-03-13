package Qspiders.Strings;

public class AddNumberString {
    static void main() {
        String s = "Ram123";
        int j, sum=0;
        for(j=0; j<s.length(); j++) {
            char ch = (s.charAt(j));
            if(ch>='0' && ch <='9') {
                sum = sum+ch-'0';
            }
        }
        System.out.println(sum);
    }
}
