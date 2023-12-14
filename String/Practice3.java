package String;

// Count how many times lowercase vovels occurds in a String entered by user.
import java.util.Scanner;

public class Practice3 {

    public static String output(String str) {
        Integer count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one String...");
        String str = sc.nextLine();
        System.out.println(output(str));
    }
}
