package Arrays;

public class Large_Small_Value {

    public static void getNumber(int[] array) {
        int Largest = Integer.MIN_VALUE; // -ve Infinity
        int Smallest = Integer.MAX_VALUE; // +ve Infinity

        for (int i = 0; i < array.length; i++) {
            if (array[i] > Largest) {
                Largest = array[i];
            }
        }
        System.out.println("Largest number :" + Largest);

        for (int j = 0; j < array.length; j++) {
            if (array[j] < Smallest) {
                Smallest = array[j];
            }
        }
        System.out.println("Smallest number :" + Smallest);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 85, 98, 4, 62, 78, 35 };
        getNumber(arr);

    }
}
