package GLAB_303_11_5_HashSet_Processing_and_TreeSet_Processing;

import java.util.HashSet;

/**
 * In this lab, we will explore and demonstrate HashSet and TreeSet. We will utilize the built-in methods.
 * Example One: Insert Elements to HashSet using addAll().
 * addAll() - Inserts all of the elements of the specified collection to the set.
 */
public class exampleOne {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
// Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);
        HashSet<Integer> numbers = new HashSet<>();
// Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }
}

