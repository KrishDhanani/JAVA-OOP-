package Practice;

/*You can also use this.
 *  Random rand = new Random();
        int a = rand.nextInt(26);
        System.out.println(a);
        char s = (char) ('A' + a);
        System.out.println(s);
 */
public class VehicalPlateNumber {
    static void p() {
        int a1 = 'A' + (int) (Math.random() * ('Z' - 'A'));
        int a2 = 'A' + (int) (Math.random() * ('Z' - 'A'));

        int d1 = (int) (Math.random() * 10);
        int d2 = (int) (Math.random() * 10);

        int a3 = 'A' + (int) (Math.random() * ('Z' - 'A'));
        int a4 = 'A' + (int) (Math.random() * ('Z' - 'A'));

        int d3 = (int) (Math.random() * 10);
        int d4 = (int) (Math.random() * 10);
        int d5 = (int) (Math.random() * 10);
        int d6 = (int) (Math.random() * 10);

        System.out.println(
                " " + (char) a1 + (char) a2 + " " + d1 + d2 + " " + (char) a3 + (char) a4 + " " + d3 + d4 + d5 + d6);
    }

    public static void main(String[] args) {
        p();
    }

}
