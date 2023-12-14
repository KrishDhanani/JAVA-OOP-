package String;

public class SubString {
    public static void SubString(String s, int si, int ei) { // si = Starting index , ei = ending index
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += s.charAt(i); // Concatination
        }
        System.out.println(substring);
    }

    public static void main(String[] args) {
        String str = "hello world";
        SubString(str, 3, 6);

        // Inbuilt java function...
        System.out.println(str.substring(3, 6));
    }
}
