package String;
// Here we convert bigger String ko 6oti String me

// if "aaabbcccdd" --> "a3b2c3d2"  // Here actualString > new String // Allowed
// But
// "abc" --> "a1b1c1" // Not allowed // Because actualString < new String  

public class StringCompression {
    public static String Strcompression(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) { // O(n)
            Integer count = 1; // (Wrapper class) Here if you write "Integer" then it's point like that class
                               // object but if you
                               // write "int" then it's normal data type.
            // if you remember .toString() function which convert any data type to String
            // Here count is give us integer value badme usko String me convert krne ke liye
            // hamne use kiya "Integer" which is actually object

            // if given string is "aaabbcc" that time while loop run
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // if String is "abc"
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(Strcompression(str));
    }
}
