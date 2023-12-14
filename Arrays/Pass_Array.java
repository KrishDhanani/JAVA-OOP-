package Arrays;

import java.util.Scanner;

public class Pass_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int x = sc.nextInt();

        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the array element:");
            arr[i] = sc.nextInt();
        }
        // Pass_Array p = new Pass_Array();
        // System.out.println("Element= " + p.print_array(arr)); ???
        print_array(arr);
    }

    public static void print_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }
}
