package GLAB_303_11_5_HashSet_Processing_and_TreeSet_Processing;

import java.util.TreeSet;

/**
 * Example three: Methods for Navigation.
 * Since the TreeSet class implements NavigableSet, it provides various
 * methods to navigate over the elements of the TreeSet.
 * 1. first() and last() Methods
 * ● first() - returns the first element of the set.
 * ● last() - returns the last element of the set.
 */
public class TreeSetExamplethree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);
        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }
}
