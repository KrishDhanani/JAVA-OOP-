package ConditionalStatment;

import java.util.Scanner;
import java.lang.Math;

// Write a Java program to solve quadratic equations (use if, else if and else).
public class Practice2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:= ");
        int a = sc.nextInt();

        System.out.println("Enter b:= ");
        int b = sc.nextInt();

        System.out.println("Enter c:= ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;
        float e = (-b + (float) Math.pow(d, 0.5)) / (2 * a);
        float f = (-b - (float) Math.pow(d, 0.5)) / (2 * a);
        float g = d ^ 1 / 2;
        System.out.println(g);
        System.out.println("Your x value is " + e + "\n" + f);
    }
}
