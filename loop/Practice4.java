package loop;

import java.util.Scanner;

class Practice4 {
    public static void main(String args[]) {
        // Java program to print sum of all even numbers
        // between 1 to n using for loop.
        System.out.println("Enter any even number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        System.out.println("Number is: ");
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("The sum is : " + sum);
        Practice4.main(args);
    }
}
