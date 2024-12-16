package GLAB_303_11_6_HashMap_and_TreeMap_Processing;

import java.util.TreeMap;

/**
 * TreeMap Examples
 * Example One: Remove TeeMap Elements.
 * ● remove(key) - returns and removes the entry associated with the specified key from a TreeMap.
 * ● remove(key, value) - removes the entry from the map only if
 * the specified key is associated with the specified value, and
 * returns a boolean value.
 */
public class exampleTreemapOne {
    public static void main(String[] args) {
        TreeMap<String,Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);

    }
}
