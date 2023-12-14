package Arrays;

import java.util.Scanner;

// class Max_and_Min(){
//     // find from 2d Array max and min number.

//     public  void max(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number of Row: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the Number of Column: ");
//         int b = sc.nextInt();

//         int[][] Number = new int[a][b];
//         int sum=0;
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 System.out.println("Enter the array Element: ");
//                 Number[i][j]=sc.nextInt();
//             }
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<Number.length;i++){
//             for(int j=0;j<Number[0].length;j++){
//                 if(max<Number[i][j]){
//                     max = Number[i][j];
//                 }
//             }
//         }
//         System.out.println(max + "<-- your max number ");
//     }
// }

class sum {
    // WAP to sum all the elements of the 2D array
    public void Asum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row: ");
        int a = sc.nextInt();
        System.out.println("Enter the Number of Column: ");
        int b = sc.nextInt();

        int[][] Number = new int[a][b];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Enter the array Element: ");
                Number[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum = sum + Number[i][j];
            }
        }
        System.out.println(sum);

    }
}

public class Practice3 {
    public static void main(String[] args) {
        // Max_and_Min mam = new Max_and_Min();
        // mam.max();
        sum s = new sum();
        s.Asum();
    }
}
