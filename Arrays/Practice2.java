package Arrays;

// There is in 3*3 array how many 7's in the metrix print that.
import java.util.Random;

public class Practice2 {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Random rand = new Random();

        // Random Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        // One time show random generated metrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }

        // finding 7's
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
