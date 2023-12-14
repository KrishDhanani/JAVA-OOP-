package Practice;

import java.util.*;

class Operation {
    public int Balance;
    Scanner sc = new Scanner(System.in);

    void setBalance(int x) {
        Balance = x;
    }

    public void withdraw() {
        System.out.println("Enter Amount you want to withdraw:");
        int x = sc.nextInt();
        int wdBalance = Balance - x;
        System.out.println("Your remaining Balance is:- " + wdBalance);
    }

    public void Deposit() {
        System.out.println("Enter amount you want to add:");
        int x = sc.nextInt();
        int deBalance = Balance + x;
        System.out.println("Your new amount is:-" + deBalance);
    }

    public void checkBalance() {
        System.out.println("Your balance is:- " + Balance);
    }
}

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation atm = new Operation();

        System.out.println("Enter your balance:");
        int b = sc.nextInt();
        atm.setBalance(b);

        System.out.println("withdraw:1 deposite:2 checkbalance:3");
        int x = sc.nextInt();

        switch (x) {
            case (1):
                atm.withdraw();
                break;
            case (2):
                atm.Deposit();
                break;
            case (3):
                atm.checkBalance();
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
