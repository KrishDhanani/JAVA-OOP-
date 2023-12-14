package Arrays;

public class PairsArray {
    public static void Pair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 25, 45, 84, 5, 65, 8 };
        Pair(arr);
    }
}
