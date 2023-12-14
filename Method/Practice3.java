package Method;
import java.util.Scanner;
public class Practice3 {

    /* Write a value-returning method, isVowel that returns the value true if a given character is a vowel, 
    and otherwise returns false.  In main() method accept a string from user and count 
    number of vowels in that string. */

    public static boolean vr(char x){
        // its check the given character is vowel.
        return (x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || 
                x=='A' || x=='E' || x=='I' || x=='O' || x=='U');
       
    }
    // private Object length;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = sc.nextLine();
        int sum = 0;
        for(int i=0; i< st.length();i++){
            if(vr(st.charAt(i))){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
