package GLAB_303_11_6_HashMap_and_TreeMap_Processing;

import java.util.TreeMap;

/**
 * Example Three: TreeMap Comparator.
 * TreeMap elements are sorted in ascending order. However, we can
 * also customize the ordering of keys. For this, we need to create our
 * comparator class based on which keys in a TreeMap are sorted.
 * Create a new Class named “CustomComparator,” then
 * Create a new Class named “maincomparator,”
 */
public class maincomparator {
    public static void main(String[] args) {
        //Creating a treemap with a customized comparator
        TreeMap<String,Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("Treemap: " + numbers);
        System.out.println("Treemap keys: " + numbers.keySet());
    }
}
