package ConditionalStatment;
import java.util.Scanner; 
public class Practice6 {
    public static void main(String args[]){

        System.out.println("Enter website url: ");
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        if(s.endsWith(".com")){
            System.out.println("The website is comersial & has .com url ");
        }
        else if (s.endsWith(".org")){
            System.out.println("Website is orgenizational & has .org url ");
        }
        else if (s.endsWith(".in")){
            System.out.println("Wesite is iundian & has .in url");
        }

    }
}
