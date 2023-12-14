import java.util.Random;

public class Revision {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(16);
        System.out.println("Today you need to do module " + x + " Revision");
    }
}
