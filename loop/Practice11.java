package loop;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        // Factorial of any number

        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);

        // Using while loop
        // int i=a;
        // while(i>=1){
        // fact=fact*i;
        // i--;
        // }
        // System.out.println(fact);

    }
}
