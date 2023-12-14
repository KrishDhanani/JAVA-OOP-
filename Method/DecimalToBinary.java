package Method;

import java.util.*;

public class DecimalToBinary {
    public static void DtoB(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;
        }
        System.out.println("binary balue is:" + binary);
    }

    public static void main(String[] args) {
        DtoB(11);
    }
}
