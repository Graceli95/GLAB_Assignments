package GLAB_303_5_1_For_Loop;
//Display Sum of n Natural Numbers
//Program to find the sum of natural numbers from 1 to 1000.
public class DisplaySum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
//        for loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " numbers is " + sum);
    }
}
