package Practice;
import java.util.Scanner;
public class Factor_Of_Number {
static void  f(int a){
    for(int i=1;i<=a;i++){
        if(a%i==0){
            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        f(a);

    }
}
