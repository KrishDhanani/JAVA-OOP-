package Method;
import java.util.Scanner;
public class Practice6 {
    // pattern make with method
    // *
    // **
    // ***
    // ****

    static void pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int a = sc.nextInt();
        System.out.println("Enter number of column");
        int b = sc.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
