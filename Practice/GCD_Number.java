package Practice;
import java.util.Scanner;
public class GCD_Number {
    static void gcd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        int i;
        for(i=a;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println("Greatest comon divisior" + i);
                break;
            }
        }
    }

    public static void main(String[] args){
        gcd();
    }
}
