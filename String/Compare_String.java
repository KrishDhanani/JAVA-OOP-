package String;

public class Compare_String {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) { // For reduase space complexity both s1 and s2 point at the same address of
                        // memory.
            System.out.println("String are equal");
        } else {
            System.out.println("Not equal");
        }

        if (s2 == s3) { // s2 is point to s1 memory but in s3 declaration new keyword is use so it point
                        // to anpother address of memory.
            System.out.println("Strings equal");
        } else {
            System.out.println("Strings not equal");
        }

        // for reduce this both thing we use function name:
        // "String1.equals(String2)"
        // Which always return boolean value.

        if (s1.equals(s3)) {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are not equals");
        }
    }
}
