package ch7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionContrast {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>(); //Ordered by Insertion and allows for duplicates
        HashSet<Integer> set = new HashSet<>(); //Random order, fast lookup though
        TreeSet<Integer> treeSet = new TreeSet<>(); //Ordered by sorting, sorts elemtns in ascending order automatically. that's why its slower than HashSet

        int [] values = {50, 23, 89, 12, 45, 7}; //2 appears twice

        for (int val : values) {
            list.add(val);
            set.add(val);
            treeSet.add(val);
        }


        System.out.println("ArrayList (ordered, duplicates: " + list);
        System.out.println("HashSet (unique, ordered): " + set);
        System.out.println("TreeSet (unique, sorted): " + treeSet);
    }
}
