package Recursion;
import java.util.Scanner;
public class Practice5 {
    // Enter the recursive function to print n natural number sum.
    // 1+2+3+4+5+...+n
    // 1+2+3+4+5+...+n-1+n
    // sum(n-1)+n
    // sum(3)=3+sum(2)
    // sum(3)=3+2+sum(1)
    // sum(3)=3+2+1
    static int sume(int x){
        // never forget to write base condition
        if(x==1){
            return 1;
        }
        return x + sume(x-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(till that number we give you sum)");
        int x = sc.nextInt();
        int c = sume(x);
        System.out.println(c);
    }
}
