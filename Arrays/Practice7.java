package Arrays;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //  WAP to multiply the two 2D arrays.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("':Both Metrix row and column are must be same:'");
        
        System.out.println("Enter the first array number of row: ");
        int r1 = sc.nextInt();

        System.out.println("Enter the first array number of column: ");
        int c1 = sc.nextInt();

        System.out.println("Enter the second array number of row: ");
        int r2 = sc.nextInt();

        System.out.println("Enter the second array number of row: ");
        int c2 = sc.nextInt();

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];


        System.out.println("Enter the first array element:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[r1][c1] = sc.nextInt();
            }
        }

        System.out.println("Enter the second array element:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[r2][c2] = sc.nextInt();
            }
        }
        int[][] multiple = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                for(int k=?????)
                mulptiple[i][j] = 
            }
        }



    }
}
