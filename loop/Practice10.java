package loop;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        // write program which display the sum of the strict divisor of integer given by
        // the user.
        int sum = 0;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
