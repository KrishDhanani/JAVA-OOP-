package Arrays;

import java.util.Random;

// Write program that have 2d Array and also 
// it allows only 1's and 0's int the array now find in which row odd 1's are there.
public class Practice8 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(2);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                count += arr[i][j];

            }
            if (count % 2 != 0) {
                System.out.println("Row" + i);
            }
            count = 0;
        }
    }
}
