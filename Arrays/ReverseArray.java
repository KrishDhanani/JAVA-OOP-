package Arrays;

// You can also do as tack second array and copy the element inside that array in reverse order and then copy the all elemnt in original array 
public class ReverseArray {
    public static void ReArray(int[] array) {
        // int left = array[0];
        // int right = array[array.length - 1];
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            array[left] = array[left] - array[right];
            array[right] = array[left] + array[right];
            array[left] = array[right] - array[left];
            // int temp = array[left];
            // array[left] = array[right];
            // array[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 78, 96, 45, 65, 20 };
        ReArray(arr);
    }
}
