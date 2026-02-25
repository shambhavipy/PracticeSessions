package CodingQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class DuplicateRemoval {
    public static void main(String[] args) {
        int var=5;

        ArrayList<String> as = new ArrayList<String>();
        as.add("TEMP_C01");
        as.add("TC02");
        as.add("TEMP_03");
        as.add("TEMP_04");
        as.add("TC05");
        as.add("TEMP_05");
        as.add("TEMP_05");
        as.add("TC06");
        as.add("TC05");
        as.add("TC05");
        System.out.println(as);

        Iterator<String> itr = as.iterator();

        while(itr.hasNext()) {
            String dup= itr.next();
            System.out.println(dup);

            }
        }
    }

