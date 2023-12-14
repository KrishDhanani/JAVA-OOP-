package Bitwise_Operator;

public class Odd_even {
    public static void oddOreven(int n) {
        int bitmask = 1;
        // even number
        if ((n & bitmask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        oddOreven(6);
        oddOreven(14);
        oddOreven(13);
    }
}
