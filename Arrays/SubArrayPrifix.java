package Arrays;

public class SubArrayPrifix {
    public static void sArray(int[] array) {

        int ts = 0;
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prifix[] = new int[array.length];

        prifix[0] = array[0];
        // Claculate prifix array
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) { // Start
            int start = i;
            for (int j = i; j < array.length; j++) { // End
                int end = j;

                CurrentSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];

                if (MaxSum < CurrentSum) {
                    MaxSum = CurrentSum;
                }
                // for (int k = i; k <= j; k++) { // Start to End
                // System.out.print(array[k]);
                // CurrentSum += array[k];
                // }
                System.out.println("\nCurrent sum: " + CurrentSum);
                ts++;
                System.out.println();
            }

            System.out.println();

        }
        System.out.println("Sub array Max Sum is: " + MaxSum);
        System.out.println("Total subArray : " + ts);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2 };
        sArray(arr);
    }???
}
