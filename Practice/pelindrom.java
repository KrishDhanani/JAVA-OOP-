package Practice;

import java.util.*;

public class pelindrom {
    public static int peli(int a) {
        int num = 0;
        while (a > 0) {
            int rem = a % 10;
            num = num * 10 + rem;
            a = a / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int pel = sc.nextInt();
        int x = peli(pel);
        System.out.println("Reverse of num is: " + x);

        if (x == pel) {
            System.out.println("Its pelindrom");
        } else {
            System.out.println("Not pelindrom");
        }
    }
}
