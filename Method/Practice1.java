package Method;
import java.util.Scanner;

public class Practice1 {
    /*  Write a program with a method named getTotal that accepts
     two integers as an argument and return its sum. Call this method from main( ) and print the results.*/

     static int sum(int x,int y){
       int z=x+y;
        return z;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = sc.nextInt();

        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        int c = sum(a,b);
        System.out.println("The sum is:"+c);
    }

}
