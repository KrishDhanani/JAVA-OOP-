package Method;
import java.util.Scanner;
public class Practice4 {
    /*  A prime number is a number that is evenly divisible only by itself and 1. 
For example, the number 5 is prime because it can be evenly divided only by 1 and 5. 
The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
Write a method named isPrime, 
which takes an integer as an argument and returns true if the argument is a prime number,
 or false otherwise. Also write main method that displays prime numbers between 1 to 500.
*/
public static boolean isPrime(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int x = sc.nextInt();
    int i=2;
    while(i<x){
        if(x%i==0){
            return true;
        } 
    }System.out.println( i + " ");
    return false;
    
}
    public static void main(String[] args) {
    isPrime();
    }
}
