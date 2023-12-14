package Arrays;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // WAP to copy all the elements of the input 2D array into another 2D array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int a = sc.nextInt();

        System.out.println("Enter the column: ");
        int b = sc.nextInt();

        int[][] Number = new int[a][b];
        int[][] exam = new int[a][b];

        // input
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Enter the Array element: ");
                Number[i][j] = sc.nextInt();
            }
        }

        // copy the element
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                exam[i][j] = Number[i][j];
            }
        }

        // output
        System.out.println("The exam array is: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(exam[i][j] + " ");
            }
            System.out.println();
        }
    }
}
