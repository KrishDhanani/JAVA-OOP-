package Sorting;

// Bubble sort time complexity is O(n^2) because in worst case all two loop is run so O(n^2)...
public class BubbleSort {

    public void sort(int[] arr) {

        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) // O(n)
        {
            for (int j = 0; j < n - 1 - turn; j++) // O(n-1-i)=O(n)
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = { 3, 5, 4, 8, 6, 9 };
        bs.sort(arr);
        bs.print(arr);
    }
}

// this code time complexity O(n) because in best case there is only one loop is
// running so O(n)...
// class example {
// public static void main(String[] args) {

// int[] arr = { 1, 2, 3, 4, 5, 6 };
// int swap = 0;
// for (int i = 0; i < arr.length - 1; i++) {

// for (int j = 0; j < arr.length - 1 - i; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// swap = 1;
// }
// }
// if (swap == 0) {
// break;
// }
// System.out.println(swap);
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i]);
// }

// }
// }