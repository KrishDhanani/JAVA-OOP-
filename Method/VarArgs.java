package Method;
import java.util.Scanner;
public class VarArgs {
    // static int sum(int a,int b){
    //     int s = a+b;
    //     return s;
    // }

    static int add(int ...arr){
        int result = 0;
        for (int x : arr) // Remember for each loop.
        {
            result = result + x;
        }
        return result;
}
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a:");
        // int a = sc.nextInt();
        // System.out.println("Enter b:");
        // int b = sc.nextInt();
        // int c = sum(a,b);
        // System.out.println("The sum is:" + c);
        
            
            System.out.println(add(1,2));
            System.out.println(add(2,3,4));
            System.out.println(add(4,5,6));
        }
        }
        
    