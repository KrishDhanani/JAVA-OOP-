package Arrays;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // WAP to sum odd row index and even column index elements.

        System.out.println("'It's 2D Array'");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array row: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of array column: ");
        int c = sc.nextInt();

        int[][] metrix = new int[r][c];
        System.out.print("The metrix form is: " + r + "*" + c + "\n");

        // input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the Array Element:");

                metrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        // row sum
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i % 2 != 0) {
                    sum = sum + metrix[i][j];
                }
            }
        }
        System.out.println("The row sum is: " + sum);

        // column sum
        int sum1 = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j % 2 == 0) {
                    sum1 = sum1 + metrix[i][j];
                }
            }
        }
        System.out.println("The column sum1 is: " + sum1);

    }
}
