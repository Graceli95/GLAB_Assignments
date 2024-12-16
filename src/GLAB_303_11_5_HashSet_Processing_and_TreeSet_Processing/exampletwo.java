package GLAB_303_11_5_HashSet_Processing_and_TreeSet_Processing;

import java.util.HashSet;

/**
 * Example Two: Union of Sets.
 * To perform the union between two sets, we can use the addAll() method.
 */
public class exampletwo {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);
// Union of two set
//        numbers.addAll(evenNumbers);
//        evenNumbers.addAll(numbers);
//        System.out.println("Union is: " + numbers);
        System.out.println("HashSet3: " + evenNumbers.addAll(numbers));
    }
}
