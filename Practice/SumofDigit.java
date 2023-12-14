package Practice;

import java.util.*;

public class SumofDigit {
    public static int sum(int a) {
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum += rem;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        System.out.println("sum of digit is: " + sum(a));
    }
}
