package String;
// Convert String all frist character lowerCase to UpperCase.

// After learn String Builder Learn This Function

public class Uppercase {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder(""); // Actually yahape StringBuilder ko initialize kia he empty String ke
                                                  // sath

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, my name is krish"; // "Hi, My Name Is Krish"
        System.out.println(toUppercase(str));
    }
}
