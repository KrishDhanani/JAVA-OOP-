package ConditionalStatment;
import java.util.Scanner;
//  Write a Java program to get a number from the user and print whether it is positive or negative.
public class Practice1 {
    public static void main(String args[]){

    System.out.println("Enter the number ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a>0){
       System.out.println("+ve number entered");
    }
    else if (a<0){
        System.out.println("-ve number entered");
    }
    else{
        System.out.println("0 number entered");
    }
    }
}
