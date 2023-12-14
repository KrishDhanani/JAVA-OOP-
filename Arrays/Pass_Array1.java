package Arrays;

public class Pass_Array1 {
    public static void main(String[] args) {
        int k[] = arr();
        for (int x : k) {
            System.out.println(x);
        }
    }

    public static int[] arr() {
        int marks[] = { 1, 2, 3, 4, 5 };
        return marks;
    }
}
