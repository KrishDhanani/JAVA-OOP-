package Practice;
import java.util.Scanner;
public class Reverse_Number {

static void re(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    int c=0;
    int r=0;
    while(a>0){
        c=a%10;
        r = (r*10) + c;
        a=a/10;
    }
    System.out.println(r);

}
    public static void main(String[] args) {
        re();
    }
}
