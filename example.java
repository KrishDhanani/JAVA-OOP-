
import java.util.*;
import java.lang.*;

// class bank {
//     int accno;
//     int balance;

//     public void accno() {
//         accno = (int) (Math.random() * 1000000000);
//         System.out.println("Acco no: " + accno);
//         Random rand = new Random();
//         System.out.println(" Acc bal:" + rand.nextInt(1000, 100000));
//     }

// }

class Armstrong {
    void digitFind(int x, int org) {
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        System.out.println(count);
        int sum = 0;
        while (org > 0) {
            int rem = org % 10;
            sum += (int) Math.pow(rem, count);
            org = org / 10;
        }
        System.out.println(sum);
        if (org == sum) {
            System.out.println("yes");
        }
    }

}

class example {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int org = e;
        a.digitFind(e, org);
    }
}