package Inharitance;
// Through method overriging mack sum of two number program.
import java.util.Scanner;
class sum1{
    public void Sum1(int x , int y){
        int z = x+y;
        System.out.println("The sum1 is:"+z);
    }
}

class sum2 extends sum1{
    @Override
    public void Sum1(int x,int y){
        int z = x+y;
        System.out.println("The sum2 is:"+z);
    }

} 

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second number:- ");
        int b = sc.nextInt();

        sum1 s1 = new sum1();
        s1.Sum1(a,b);

        sum2 s2 = new sum2();
        s2.Sum1(a,b);
    }
}
