package String;

// what is Anagtrams?
// If two String contains same character but in different order then they two are anagrams String.
// Example: 1.race 2.care etc.

// 1.
// public class Anagrams {
//     public static StringBuilder check(String s1, String s2) {
//         if (s1.length() != s2.length()) {
//             System.out.println("both are not anagrams");
//         }
//         StringBuilder sb = new StringBuilder("");
//         for (int i = 0; i < s1.length(); i++) {
//             char ch = s1.charAt(i);
//             do {
//                 if (ch == s2.charAt(i)) {
//                     sb.append(s2.charAt(i));
//                     break;
//                 }
//                 i++;
//             } while (ch != s2.charAt(i));
//         }
//         return sb;

//     }

//     public static void main(String[] args) {
//         String s1 = "race";
//         String s2 = "care";
//         StringBuilder str = check(s1, s2);
//         s1.equals(str);
//     }
// }

// 2.
import java.util.Arrays;

class Anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // Convert String to lowerCase. Why? so that we don't have to check separetly
        // for lower & upperCase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the length are same
        if (str1.length() == str2.length()) {

            // Convcert String into char Array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the charArray
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted char arrays are same or identical then the String are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println("It is anagrams of each other");
            } else {
                System.out.println("not anagrams");
            }
        }
        // If length are not equal
        else {
            System.out.println("not anagrams");
        }

    }
}