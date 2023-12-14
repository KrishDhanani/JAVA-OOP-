package ConditionalStatment;
import java.util.Scanner;
public class Practice3 {
    // finding tex.
    public static void main(String args[]){

        System.out.println("Enter your Salary in lakh");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = 0;
        if(a<=2.5){
            System.out.println("You not need to pay tax");
        }
        else if(a>2.5 && a<=5.0){
            b = a*0.05f; 
            System.out.println("you need to pay tax & your tax amount is " +b+ "lakh");
        } 
        else if(a>5.0 && a<=10.0){
            b = b + 0.05f * (2.5f-5.0f); 
            b= b + 0.2f * (10.0f - 5.0f);
            System.out.println("you need to pay tax & your tax amount is " +b+ "lakh");
        }
        else{
            b = b + 0.05f * (2.5f-5.0f); 
            b = b + 0.2f * (10.0f - 5.0f);
            b = b + 0.3f * (a - 10.0f);
            System.out.println("you need to pay tax & your tax amount is " +b+ "lakh");
        }

    }

}
