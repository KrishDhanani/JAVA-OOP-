package loop.Pattern;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        /*  Write a program in Java to display the pattern
         like right angle triangle with a number.*/
         System.out.println("Enter the number ");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");                                 
            }
            System.out.println();
         }
    }
}
