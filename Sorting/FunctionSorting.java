package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class FunctionSorting {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 9, 7 };

        // Assending Order Sorting...

        // Arrays.sort(arr); // Full array sort
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, 1, 3); // For Perticuler bound sort Array
        System.out.println(Arrays.toString(arr));

        // Desending Order Sorting...

        Integer[] array = { 2, 6, 3, 9, 7 }; // basically for use of collection we need to create object of Integer.
        // Arrays.sort(array, Collections.reverseOrder());
        // System.out.println(Arrays.toString(array));

        Arrays.sort(array, 2, 5, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }
}
