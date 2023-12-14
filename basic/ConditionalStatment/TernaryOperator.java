package ConditionalStatment;

public class TernaryOperator {
    public static void main(String[] args) {
        
        int n=2;
        int result=0;

        // if(n%2==0)
        //     result=10;
        // else
        //     result=20;

        // ?:
        // ? <- shows the condition is true or false
        // : <- shows the word otherwise

        result = (n%2==0) ? 10 : 20 ; 
        System.out.println(result);

    }
}
