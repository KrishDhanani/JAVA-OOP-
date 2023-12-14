package String;

import java.util.Scanner;

public class BasicString2 {

    public static void main(String args[]) {

        char[] c = { 'A', 'p', 'n', 'a', ' ', 'c', 'o', 'l', 'l', 'a', 'g', 'e' };
        String str = new String("Apna collage @#12");
        String str1 = "Apna collage";

        // NOTE: "STRING ARE IMMUTABLE".

        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str2);

        // String Always Store in array form.
        // In the array "length" is property but here it's function.
        // Array: arr.length
        // String: str.length()
        // NOTE: IN THE ARRAY INDEXING START WITH "0" AND ALSO STRING INDEXING START
        // WITH "0".

        String fullname = "Tony Stark";
        System.out.println(fullname.length()); // Here in the length function space is also count.

        // Concatenation
        String firstname = "Krish";
        String lastname = "Dhanani";
        String fullname1 = firstname + " " + lastname;
        System.out.println(fullname1);

        // For finding perticular character in string at some index we are use
        // "Stringname.charAt()" .
        System.out.println(fullname1.charAt(0));

        // For printing all the charector
        for (int i = 0; i < fullname1.length(); i++) {
            System.out.print(fullname1.charAt(i) + " ");
        }

    }
}