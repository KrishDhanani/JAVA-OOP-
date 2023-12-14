package Arrays;

import java.util.Scanner;

public class Basic_Of_2D_array {
    public static void main(String args[]) {

        // Declaring 2D array
        // int Marks[] = new int[2][3]; //It's 2*3 metrix

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int c = sc.nextInt();
        int[][] Marks = new int[r][c];

        // input
        for (int i = 0; i < r; i++) { // Insted of 'r' You can also write there Marks.length...
            for (int j = 0; j < c; j++) { // Insted of 'c' You can also write there Matrix[0].length...
                System.out.print("Enter the array element: ");
                Marks[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
