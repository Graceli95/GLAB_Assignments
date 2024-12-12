package GLAB_303_11_2_ArrayList_and_ArrayList_Methods;
/**
 * Example 4: Removing Elements from an ArrayList
 * This example shows:
 * 1. How to remove an element at a given index in an ArrayList |
 * remove(int index).
 * 2. How to remove an element from an ArrayList | remove(Object
 * o).
 * 3. How to remove all of the elements from an ArrayList that exist
 * in a given collection | removeAll().
 * 4. How to remove all of the elements matching a given
 * predicate | removeIf().
 * 5. How to clear an ArrayList | clear().
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List: " + programmingLanguages);


        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After removing 5: " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
// (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);


        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages); //use removeAll() method here, just passing the given collection
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);


        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
