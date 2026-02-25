package CodingQuestions;
import java.util.ArrayList;
import java.util.LinkedHashSet;


public class ArrayListDuplicates {

    public static void main(String[] args) {

        ArrayList<String> testcases = new ArrayList<>();
        testcases.add("TC01");
        testcases.add("TC02");
        testcases.add("TC01");
        testcases.add("TC03");
        testcases.add("TC02");
        System.out.println(testcases);

        ArrayList<String> twd = new ArrayList<String>(new LinkedHashSet<>(testcases));

        System.out.println(twd);

        ArrayListDuplicates publicALD = new ArrayListDuplicates();


    }
}
