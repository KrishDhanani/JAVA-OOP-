package Sorting;

public class CountingSort {

    public void sort(int[] array) {
        int largest = Integer.MIN_VALUE;
        // Find the max value...
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        // Generate counting array...
        int count[] = new int[largest + 1]; // Because index start with 0.
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Sorting...
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]++;
            }???
        }

        // Show sorted array...
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 6, 9, 4 };
        CountingSort cs = new CountingSort();
        cs.sort(arr);
    }
}
