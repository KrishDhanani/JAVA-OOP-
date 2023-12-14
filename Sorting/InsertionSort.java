package Sorting;

public class InsertionSort {
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;
            // finding the currect position to insert
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            // insertion
            array[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 87, 6, 45, 78, 3, 5 };
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
}
