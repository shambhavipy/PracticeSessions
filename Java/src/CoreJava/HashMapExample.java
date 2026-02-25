package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        /*hm.put(0, "Hello");
        hm.put(1, "Shambhavi");
        hm.put(2, "Good");
        hm.put(3, null); */
        hm.put("John", 1);
        hm.put("Carl", 2);
        hm.put("Tom", 3);
        hm.put("Jerry", 11096);

        //System.out.println(hm.get(0));
        //hm.remove(3);
        //System.out.println(hm.get("Tom"));
        hm.replace("Tom", 11095);
        System.out.println(hm.putIfAbsent("Steve", 222));
        System.out.println(hm);


        }

    }

