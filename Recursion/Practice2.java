package Recursion;
import java.util.Scanner;
public class Practice2 {
    // How to reverse String in Java using Recursion.
    public static String revers(String st){
        if(st==null && st==""){
            return " ";
        }
        String sa=" ";
        for(int i=st.length();i>0;i--){
            sa = sa + st.charAt(i); 
        }
        return sa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
       
        System.out.println(revers(sa));
        ??????
    }
}
