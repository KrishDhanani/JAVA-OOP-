package loop;
import java.util.Scanner;
public class Practice8 {
    // Write a program in Java to display the cube of the number upto given an integer.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println(i*i*i);
        }
    }
}

