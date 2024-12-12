package GLAB_303_11_2_ArrayList_and_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Example 5: Iterating over an ArrayList
 * The following example shows how to iterate over an ArrayList using:
 * 1. iterator().
 * 2. iterator() and forEachRemaining() method.
 * 3. listIterator().
 * 4. Simple for loop.
 * 5. Enhanced for loop with index.
 */
public class IterateOverArrayList {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n===Iterate over ArrayList using iterator()===");
        Iterator<String> tvShowIterator = tvShows.iterator();//Iterator here is Generic Interface, has to pass a datatype,list tvShows use iterator() method to implement Iterator Interface
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }


        System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });


        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }


        System.out.println("\n=== Iterate iterator ===");
        //Unlike Iterator, which only moves forward, ListIterator can traverse a list in both directions
        //ListIterator allows you to add, remove, or update elements during iteration.
        ListIterator<String> iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("=========Elements in backward direction======");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
