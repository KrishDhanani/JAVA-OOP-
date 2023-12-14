package Arrays;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 1. create an array of 5 float and calculate their sum.

        // float sum = 0.0f;
        // float [] Number = {2.5f,5.0f,7.0f,32.5f,45.0f};
        // for(int i=0;i<Number.length;i++){
        // sum = sum + Number[i];
        // }
        // System.out.println(sum);

        // 2; write program to find out wether a given float present in array or not.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number ");
        // float f = sc.nextFloat();
        // float [] Number = {2.5f,5.0f,7.0f,32.5f,45.0f};
        // for(int i=0;i<Number.length;i++){
        // if(f==Number[i]){
        // System.out.println("Number is present in array");
        // }
        // }

        // 3; Calculate the average marks of array containing
        // marks of all student in physics using for each loop.

        // float sum = 0;
        // float [] Number = {2.5f,5.0f,7.0f,32.5f,45.0f};
        // for(float element:Number){
        // sum = sum + element;
        // }
        // System.out.println(sum);
        // float avg = sum / (Number.length);
        // System.out.println(avg);

        // 4; Write java program to find sum of two metrises of sign 2*3.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array row: ");
        int r1 = sc.nextInt();

        System.out.println("Enter first array column: ");
        int c1 = sc.nextInt();

        System.out.println("Note: BOTH ARRAY'S ROW AND COLUMN ARE MUST BE SAME");
        System.out.println("\nEnter second array row: ");
        int r2 = sc.nextInt();

        System.out.println("Enter first array row: ");
        int c2 = sc.nextInt();

        int[][] first = new int[r1][c1];
        int[][] second = new int[r2][c2];
        int[][] sum = new int[r1][c2];
        if (r1 == r2 && c1 == c2) {
            // first array input
            System.out.println("First array: ");
            System.out.println("Enter the first array element: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    first[i][j] = sc.nextInt();
                }
            }
            // second array input
            System.out.println("Second array: ");
            System.out.println("Enter the second array element: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    second[i][j] = sc.nextInt();
                }
            }
            // sum of the two array
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = first[i][j] + second[i][j];
                }
            }
            // output of sum array
            System.out.println("The sum of the array: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Sorry, Both Metrix Row and Column are not same so that Summetion is not possible ");
        }
    }
}
