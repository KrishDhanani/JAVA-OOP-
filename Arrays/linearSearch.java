package Arrays;

public class linearSearch {
    public static void FindKey(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("The index number is: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 15, 48, 65, 3, 78 };
        int key = 20;
        FindKey(arr, key);
    }
}
