import java.util.Scanner;

// out of 100 marks per subject
class Result {
    public static void main(String args[]) {
        System.out.println("Enter First ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second ");
        int b = sc.nextInt();
        System.out.println("Enter Third ");
        int c = sc.nextInt();
        System.out.println("Enter Fourth ");
        int d = sc.nextInt();
        System.out.println("Enter Fifth ");
        int e = sc.nextInt();

        int n = a + b + c + d + e;
        float m = n * 100 / 500;
        System.out.println("Your final marks is " + m + "%");

    }
}