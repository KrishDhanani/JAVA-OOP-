package Arrays;

// for binary search always array in sorted form
// mid=(l+r)/2;
// Case1: data=a[mid] : Element found
// Case2: data<a[mid] : r=mid-1
// Case3: data>a[]mid : l=mid+1
// case4: l>r   :  Element not found
import java.util.*;

public class BinarySearch {
    public static void Operation(int[] array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element you want");
        int data = sc.nextInt();

        int left = array[0];
        int right = array[array.length - 1];

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == data) {
                System.out.println("Element found at index" + mid);
            } else if (array[mid] > data) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 15, 48, 78, 96, 101 };
        Operation(arr);
    }
}
