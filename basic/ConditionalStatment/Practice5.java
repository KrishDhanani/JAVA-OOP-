package ConditionalStatment;

import java.util.Scanner;

// Finding leap year or not
public class Practice5 {
    public static void main(String args[]) {

        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y % 4 == 0) {
            System.out.println("IT's leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
