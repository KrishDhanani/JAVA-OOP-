package loop;

import java.util.Scanner;

public class Practice5 {
    // Java program to print multiplication of any number using for loop.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 ");
        int number2 = sc.nextInt();
        for (int i = number1; i >= number1; number1++) {
            for (int j = number2; j >= number2; j++) {
                if (i == number1 && j == number2) {
                    int m = number1 * number2;
                    System.out.println(m);
                }
            }
        }

    }
}
