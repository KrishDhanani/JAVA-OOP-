package String;

// Basically this program is orīginal StringComperission file new version using StringBuilder.
public class StringCompression1 {

    public static String sc(String str) {
        StringBuilder sb = new StringBuilder(); // Here sb perform as new String

        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String compressString = sc(str);
        System.out.println(compressString);
    }
}
