package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("India");
        hs.add("UK");
        hs.add("India"); //Hashset is not considering this duplicates value//
        hs.add("India"); //Hashset is not considering this duplicates value//

        System.out.println(hs);
        //System.out.println(hs.remove("UK"));
        //System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        Iterator<String> i = hs.iterator();

        while(i.hasNext()) {                    //it will point to the index of the set.

            System.out.println(i.next());      //this will print the value of the index.
        }

    }




}
