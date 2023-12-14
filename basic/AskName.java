import java.util.Scanner;
public class AskName{
    public static void main(String[] args)
    {
        
        System.out.println("What's your name ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print("Your name is " + n + " How are you?");
        // System.out.println(" How are you?");
        AskName.main(args); //which is use for again ask for value.
    }
} 