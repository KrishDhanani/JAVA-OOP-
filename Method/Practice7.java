package Method;
import java.util.Scanner;
public class Practice7 {
    // write following pattern.
    // ****
    // ***
    // **
    // *

    static void pattern(int a,int b){
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int a = sc.nextInt();
        System.out.println("Enter number of column");
        int b = sc.nextInt();
        pattern(a,b);
    }
}
