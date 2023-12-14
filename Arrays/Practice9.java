package Arrays;

import java.util.*;

public class Practice9 {
    public static void main(String[] args) {
        // Write a Java program to sort a numeric array and a string array.

        int Number[] = { 5, 6, 1, 10, 2, 3 };
        String st[] = { "krish", "madhav", "jeet", "heer" };
        // System.out.println("Enter String ");
        // Scanner sc = new Scanner(System.in);
        // String St = sc.nextLine();
        // String ss[] = new String[St];

        Arrays.sort(Number);
        System.out.println("Sorted intiger " + Arrays.toString(Number));

    }
}
