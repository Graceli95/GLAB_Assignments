package GLAB_303_11_5_HashSet_Processing_and_TreeSet_Processing;

import java.util.TreeSet;

/**
 * Example four: sort the given TreeSet alphabetically in
 * reverse order.
 * In this example, we will implement a Comparator class to sort the
 * given TreeSet alphabetically in reverse order. By default, the TreeSet
 * sorts data in ascending order.
 * We can also sort TreeSet in a customized order by defining a new
 * comparator class. In this comparator class, we need to override the
 * ‘compare’ method to sort the elements of the TreeSet. This
 * comparator object is then passed to the TreeSet constructor.
 */
public class TreeSetExampleCom {
    public static void main(String[] args) {
        //Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);

    }
}
