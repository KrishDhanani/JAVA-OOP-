package loop;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        /*
         * Write a program in Java to display the
         * n terms of odd natural number and their sum.
         */
        int sum = 0;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
