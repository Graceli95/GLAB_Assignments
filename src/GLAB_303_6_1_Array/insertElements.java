package GLAB_303_6_1_Array;

import java.util.Scanner;

/**
 * Insert an Element at the end of an Array in Java
 */
public class insertElements {
    public static void main(String[] args) {


        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++)
            System.out.print(arr[i]+ " ");

    }
}
