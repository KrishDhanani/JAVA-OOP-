package Recursion;

import java.util.Scanner;

public class Practice3 {
    // Write a countDown(int number) method in Java using
    // Recursion which prints countdown till zero to console,
    // like count(3) should print 3 2 1 0

    static void countDown(int number) {
        if (number >= 0) {
            System.out.print(number + " ");
            countDown(number - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count number: ");
        int number = sc.nextInt();

        countDown(number);
    }
}
