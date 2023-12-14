package String;

// Check the String is pelindrom or not.
public class Practice1 {
    public static boolean check(String str) {
        for (int i = 0; i < (str.length()) / 2; i++) { // O(n)
            // for check not pelindrom
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar"; // e.g. noon
        System.out.println(check(s));
    }
}
