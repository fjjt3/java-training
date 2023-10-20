package javaSet;

import java.util.*;

public class setDemo {
    public static void main(String[] args) {
        int[] list1 = {1,5,5, 6,6};
        int [] list2 = {1,12,12,3,3,5};

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        // add items in two diferents sets
        for (int item : list1)
            set1.add(item);
        for (int item : list2)
            set2.add(item);

        // display sets
        System.out.println("The first set is " + set1);
        System.out.println("The second set is " + set2);

        // Union sets
        Set<Integer> union = new HashSet<Integer>(set1); // copy set1
        union.addAll(set2); // add items 2
        System.out.println("Set union: " + union);

    }
}
