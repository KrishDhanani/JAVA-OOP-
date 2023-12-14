package Method;
import java.util.Scanner;

public class Practice5 {
    // write java method to print multiplication table of given number.
    static void multiplication(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    for(int i=1;i<=10;i++){
        int m = a*i;
        System.out.println(a + "*" + i + "=" + m);
    }
    
    }

    public static void main(String[] args) {
        multiplication();
    }
}
