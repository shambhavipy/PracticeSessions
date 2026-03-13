package PracticeQuestions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePosNeg {
    void rearrange(ArrayList<Integer> arr) {
        int i, j = 0;
        ArrayList<Integer> arrP = new ArrayList<>();
        ArrayList<Integer> arrN = new ArrayList<>();
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                arrP.add(arr.get(i));
            } else {
                arrN.add(arr.get(i));
            }
        }
        int minsize;
        int maxsize;
        if (arrP.size() > arrN.size()) {
            minsize = arrN.size();
            maxsize = arrP.size();
        } else {
            minsize = arrP.size();
            maxsize = arrN.size();
        }

        for (i = 0; i < minsize; i++) {
            arr.set(j, arrP.get(i));
            j++;
            arr.set(j, arrN.get(i));
            j++;
        }

        if(arrP.size() > arrN.size()) {
            for(int k = minsize; k<maxsize; k++) {
                arr.set(j,arrP.get(k));
                j++;
            }
        } else {
            for(int k=minsize; k<maxsize; k++) {
                arr.set(j,arrN.get(k));
                j++;
            }
        }
        System.out.println(arr);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(35,-43,29,32,29,-37,46,39,-3,-43,-19,32,43,27,28,11,43,-21,-35,-25,-2,36,-13,-6,2,-45,-37,-4,-37,35,-46,5,-13,10,41,-34,-30,28,-47,-9,26,21,-44,17,16,-5,39,14,-35,24,-9,12,-15,31,-32,32,47,16,-30));
        AlternatePosNeg alternatePosNeg = new AlternatePosNeg();
        alternatePosNeg.rearrange(arr);
    }
}
