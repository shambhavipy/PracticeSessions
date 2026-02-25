package CodingQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class DynamicTCRemoval {
    public static void main(String[] args) {

        ArrayList<String> testcases = new ArrayList<>();
        testcases.add("TEMP_C01");
        testcases.add("TC02");
        testcases.add("TEMP_03");
        testcases.add("TEMP_04");
        testcases.add("TC05");
        testcases.add("TEMP_05");
        testcases.add("TEMP_05");
        testcases.add("TC06");
        testcases.add("TC05");
        testcases.add("TC05");
        //System.out.println(testcases);

        Iterator<String> itr = testcases.iterator();

        while(itr.hasNext()) {
            String tc = itr.next();
            if(tc.contains("TEMP_")) {
                itr.remove();
            }
        }
        System.out.println(testcases);
    }
}
