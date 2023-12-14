package loop;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // check the numbe is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        if (a == 2) {
            System.out.println("It's prime");
        } else {
            for (int i = 2; i < a; i++) // <----this loop run n-2 times
            // for(int i=2;i<Math.sqrt(a);i++)<---this loop run root n times
            {
                if (a % i == 0) {
                    System.out.println("not prime");
                    break;
                }
            }
            System.out.println("It's prime");
        }
    }
}
