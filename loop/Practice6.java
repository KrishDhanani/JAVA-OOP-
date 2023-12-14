package loop;

import java.util.Scanner;

public class Practice6 {
    // Java program to count the digits of a given number using for loop.
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
