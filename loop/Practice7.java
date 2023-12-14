package loop;
import java.util.Scanner;
public class Practice7 {

    // Write a program in Java to display the multiplication table of a given integer. 
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
