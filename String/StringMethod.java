package String;
import java.util.Scanner;
public class StringMethod {
    public static void main(String args[]){
        String a="Krish"; // String st = new String("Krish");
        //length of String
        Scanner sc = new Scanner(System.in);
        int v = a.length(); 
        System.out.println(v);

        //toLowerCase
        String lc = a.toLowerCase();
        System.out.println(lc);
        
        //toUpperCase
        String uc = a.toUpperCase();
        System.out.println(uc);

        // tack input from user and perform some task
        System.out.println("Enter the String ");
        Scanner ss = new Scanner(System.in);
        String j = ss.nextLine();
        String u = j.toUpperCase();
        System.out.println(u);


        //toTrim (Bassically it's remove unwanted space)
        String yt = "  Yesha  ";
        String jk = yt.trim();// System.out.println(yt.trim());
        System.out.println(jk);

        // Substring method
        System.out.println(yt.substring(2));
        // ?????????????
        // ?????????????
        // ?????????????

    }
}
