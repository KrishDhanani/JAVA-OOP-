package Arrays;

// Find all sub Array and also find totalsum of array,MaxSum of subArray
public class SubArray {
    public static void sArray(int[] array) {

        int ts = 0;
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) { // Start
            for (int j = i; j < array.length; j++) { // End
                for (int k = i; k <= j; k++) { // Start to End
                    System.out.print(array[k]);
                    CurrentSum += array[k];
                }

                System.out.println("Current sum: " + CurrentSum);
                // CurrentSum = 0;
                ts++;
                System.out.println();
            }
            if (MaxSum < CurrentSum) {
                MaxSum = CurrentSum;
            }

            System.out.println();

        }
        System.out.println("Max Sum is: " + MaxSum);
        System.out.println("Total subArray : " + ts);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4 };
        sArray(arr);
    }
}???