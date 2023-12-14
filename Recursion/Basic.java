package Recursion;

public class Basic {
    // factorial 0 = 1
    // factorial(n) = n * n-1 * n-2 * ... * 1
    // factorial(5) = 5 * 4 * 3 * 2 * 1
    // factorial(n) = n * factorial(n-1)

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
    public static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 0;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 5; int n=5;
     System.out.println("The factorial of given number is : " + factorial(x));
     System.out.println("The factorial of given number is : " + factorial_iterative(n));        
    }
}
