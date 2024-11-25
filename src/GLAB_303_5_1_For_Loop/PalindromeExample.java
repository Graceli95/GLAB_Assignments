package GLAB_303_5_1_For_Loop;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
//        objects of String class
       String original, reverse = "";
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a string/number to check if it's a palindrome: ");
       original = in.nextLine();
       int length = original.length();
       for (int i = length - 1; i >= 0; i--) {
           reverse = reverse + original.charAt(i);
           if (original.equals(reverse)) {
               System.out.println("Entered string/number is a palindrome");
           } else {
               System.out.println("Entered string/number is not a palindrome");
           }
       }
    }
}
