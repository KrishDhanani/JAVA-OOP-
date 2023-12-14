package Practice;

import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many call you doing in this month:");
        int x = sc.nextInt();
        int bill;
        if (x <= 100) {
            bill = 200;
            System.out.println("Your bill is" + bill);
        } else if (x > 100 && x <= 150) {
            float bill1 = 200 + ((x - 100) * 0.60f);
            System.out.println("Your bill is " + bill1);
        } else if (x > 150 && x <= 200) {
            float bill2 = 200 + (0.6f * 50) + ((x - 150) * 0.5f);
            System.out.println("Your bill is " + bill2);
        } else {
            float bill3 = 200 + (50 * 0.6f) + (50 * 0.5f) + ((x - 200) * 0.4f);
            System.out.println("Your bill is:" + bill3);
        }
    }
}
