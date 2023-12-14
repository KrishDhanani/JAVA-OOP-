package Arrays;

import java.util.Scanner;

public class Sum_Diagonal {
    public static void main(String[] args) {
        // WAP to find the sum of diagonal elements of the 2D array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number row of metrix: ");
        int r = sc.nextInt();

        System.out.print("Enter the number column of metrix: ");
        int c = sc.nextInt();

        int[][] metrix = new int[r][c];

        // input
        System.out.println("Enter the array element:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                metrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // output
        // if (r == c && r % 2 == 0) {
        // // This code time complexity is O(n^2)
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) { // left to right sum
        // if (i == j) {
        // sum = sum + metrix[i][j];
        // }
        // else if (i +j == metrix.length-1) { // right to left sum
        // sum += metrix[i][j];
        // }
        // }
        // }
        // }

        // this code time complexity is O(n)
        for (int i = 0; i < metrix.length; i++) {
            // Primary diagonal
            sum += metrix[i][i];

            // Secondary diagonal
            // in upper code our SecondaryDiagonal => i+j=n-1 So, j=n-1-i

            if (i != metrix.length - 1 - i)
                sum += metrix[i][metrix.length - 1 - i];
        }
        System.out.println("The diagonal sum is: " + sum);

    }
}
