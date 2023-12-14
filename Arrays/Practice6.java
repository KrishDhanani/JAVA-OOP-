package Arrays;

// print the 2nd row sum
import java.util.Random;

public class Practice6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        int m = rand.nextInt(10);
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int j = 0; j < arr[0].length; j++) {

            sum += arr[1][j];
        }
        System.out.println("the sum:" + sum);
    }

}
