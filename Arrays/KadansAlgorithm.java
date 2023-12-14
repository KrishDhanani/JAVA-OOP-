package Arrays;

// kadans algorithm say that if number in array is -ve then let's concider it as 0
public class KadansAlgorithm {
    public static void kadanes(int[] array) {
        int ms = Integer.MIN_VALUE; // max sum
        int cs = 0; // current sum

        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs); // compare the cs and ms and which one is maximum is store in ms.
        }
        System.out.println("Max sum of subArray is : " + ms);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -6, 3, -1, };
        kadanes(arr);

    }
}
