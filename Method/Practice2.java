package Method;
import java.util.Scanner;
public class Practice2 {
    /* Write a method named isEven that accepts an int argument. The method should return true if the 
    argument is even, or false otherwise. Also write a program to test your method.*/
    static boolean isEven(int x){
        if(x%2==0){
            return true;
        }
        else{
        return false;}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : " );
        int a = sc.nextInt();
        boolean b = isEven(a);
        System.out.println(b);
    }
}
