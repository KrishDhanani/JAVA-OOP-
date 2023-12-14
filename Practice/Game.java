package Practice;
import java.util.Scanner;
public class Game {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the geusor number ");
        int geusor = sc.nextInt();
        
       int  umpire = geusor;
        System.out.println(" The Umpire geted number is " + umpire);
        

        System.out.println(" The P1 number is " );
        int P1 = sc.nextInt();

        System.out.println(" The P2 number is " );
        int P2 = sc.nextInt();

        System.out.println(" The P3 number is " );
        int P3 = sc.nextInt();


        if(geusor==P1){
            System.out.println("The P1 is Winner");
        }
        else if(geusor==P2){
            System.out.println("The P2 is Winner");
        }
        else if(geusor==P3){
            System.out.println("The P3 is Winner");
        }
        else{
            System.out.println("Sorry all are wrong thinking");
        }

        if(P1==P2){
            System.out.println("P1 same P2");
        }
        else if(P2==P3){
            System.out.println("P2 same P3");
        }
        else if(P1==P3){
            System.out.println("P1 same P3");
        }
        else if(P1==P2 && P2==P3){
            System.out.println("P1 & P2 & P3 are same");
        }
        else {
            System.out.println("No one is same");
        }

    }
}
