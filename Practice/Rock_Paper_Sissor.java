package Practice;

import java.util.Random;
import java.util.Scanner;
class computer{
    
    public int computer() {
    Random random = new Random();
    int computerInput = random.nextInt(3);
    return computerInput;
    }
    }
    
public class Rock_Paper_Sissor { 
    public static int person(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock ; Enter 1 for paper ; Enter 2 for Sessor: ");
        int x = sc.nextInt();
        return x;
    }
    public static void main(String args[]){
       int p =  person(0);
        computer c = new computer();
        int v = c.computer();
        System.out.println(c.computer());

        if(p==0 && v==2 || p==1 && v==0 || p==2 && v==1){
            System.out.println("Person Win!");
        }
        else if(p==0 && v==0 || p==1 && v==1 || p==2 && v==2){
            System.out.println("You both perform same action!");
        }
        else{
            System.out.println("Computer Win!!!");
        }
    }
}
