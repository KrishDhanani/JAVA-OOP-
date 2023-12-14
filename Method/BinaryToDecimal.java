package Method;

import java.util.*;

public class BinaryToDecimal {
    public static void BtoD(int binary) {
        int decimal = 0;
        int pow = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binary = binary / 10;
        }
        System.out.println("My decimal num: " + decimal);
    }

    public static void main(String[] args) {
        BtoD(10);
    }
}
// Also you can write like ...
// But it's time complexity is higher...
// class example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter binary number");
// int x = sc.nextInt();
// int org = x;
// int rem, i = 0, sum = 0;
// while (x > 0) {
// rem = x % 10;
// sum += rem * Math.pow(2, i);
// i++;
// x = x / 10;
// }
// System.out.println("Decimal is: " + sum);

// int x1 = org;
// int count = 0;
// while (x1 > 0) {
// x1 = x1 / 10;
// count++;
// }
// System.out.println(count);

// int[] arr = new int[count];
// for (int t = arr.length - 1; t >= 0; t--) {
// arr[t] = org % 10;
// org = org / 10;
// }

// for (int k = 0; k < arr.length; k++) {
// try {
// if (arr[k] != 0 && arr[k] != 1) {
// throw new NumberFormatException("Invalid Input");
// }
// } catch (NumberFormatException n) {
// System.out.println("Error! Enter only 0's or 1's in your input!");
// }
// }
// }
// }