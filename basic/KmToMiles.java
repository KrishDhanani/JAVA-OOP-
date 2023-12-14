import java.util.Scanner;

public class KmToMiles {
    public static void main(String args[]) {
        System.out.println("Enter km ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b;
        b = (float) ((a) * 0.6213);
        System.out.println(b);
    }
}
