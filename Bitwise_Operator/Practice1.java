package Bitwise_Operator;

// Swaping two number without using third variable.
public class Practice1 {
    public static void main(String[] args) {
        // Actually we use here property of x^x=0 exclusive or
        int x = 3;
        int y = 4;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swaping number X:" + x + " After Swaping number Y:" + y);

    }
}
