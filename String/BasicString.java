package String;

import java.util.Scanner;

public class BasicString {
    public static void main(String args[]) {
        String st = new String("krish");
        System.out.println(st);
        // System.out.print(st);
        // System.out.format(st);
        int a = 20;
        int b = 30;
        System.out.printf("First value is " + a + " Second value is " + b);
        System.out.printf("First value is %d Second value is %d", a, b);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(a);
    }
}
