package Sorting;

public class SelectionSort {
    public void sort(int[] array) {
        // count turns
        for (int i = 0; i < array.length - 1; i++) // till array.length-2 because no need to check the last element
        {
            // swap=i;
            for (int j = i + 1; j < array.length; j++) // till array.length-1 because no need to check the last
                                                       // element
            {
                if (array[i] > array[j]) {
                    // i = j;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // int temp = array[swap];
            // array[swap] = array[i];
            // array[i] = temp;
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 5, 8, 12, 45 };
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        ss.print(arr);
    }
}
