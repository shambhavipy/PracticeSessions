package CoreJava;

import CodingQuestions.ArrayListDuplicates;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<String> ars = new ArrayList<String>();
        ars.add("Shambhavi");


        ars.add("Java");
        ars.add("TOI");
        ars.add("HT");
        ars.add("DJ");
        //	ars.add(0,"Shruti");
        //	System.out.println(ars);

        ars.remove("Shruti");
        //	System.out.println(ars);

        //System.out.println(ars.contains("90"));
        ars.add(0,"Shruti");
        //	System.out.println(ars);
        //	System.out.println(ars.indexOf("Java"));

        //	System.out.println(ars.isEmpty());
        //	System.out.println(ars.size());

		/*for(int i=0;i<ars.size();i++) {

			System.out.println(ars.get(i));
		}*/

        for(String s: ars) {
            System.out.println(s);
        }

    }

}
