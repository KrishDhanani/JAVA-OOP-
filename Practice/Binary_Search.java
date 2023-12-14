package Practice;
// Write a program to implement algorithm with help of method & passing array technique.
import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int x = sc.nextInt();
        int[] arr = new int[x];
       
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the array element:");
            arr[i]=sc.nextInt();
        }

        pass(arr);
    }

    public static void pass(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int l = array[0];
        int r = array.length;
        int  mid ;
        
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number you want to find: ");
        int data = st.nextInt();

        
        while (l <= r) {
            mid = (l + r) / 2;

            if (data == array[mid]) {
                System.out.println("Element Found: " + array[mid]);
                return;
            } else if (data < array[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
    }
    System.out.println("Element not found");
}
}
