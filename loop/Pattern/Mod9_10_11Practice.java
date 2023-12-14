package loop.Pattern;

public class Mod9_10_11Practice {
    public static void main(String[] args) {

        // 1.<-----------
        // * * * * *
        // * ______*
        // * ______*
        // * * * * *

        // int row = 4;
        // int column = 5;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= column; j++) {
        // if (i == 1 || i == row || j == 1 || j == column) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 2.<-----------
        // roteted half pyramid
        // ____*
        // ___**
        // __***
        // _****

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= (4 - i + 1); j++) {
        // System.out.print(" ");
        // }

        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // 3.<-----------
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= (5 - i + 1); j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 4.<-----------
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int number = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        // 5.<-----------
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (i - j == 0 || (i - j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // 6.<-----------
        // *______*
        // **____**
        // ***__***
        // ********
        // ********
        // ***__***
        // **____**
        // *______*

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j < (4 - i + 1); j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k < (4 - i + 1); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= (4 - i + 1); j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k < i; k++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k < i; k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= (4 - i + 1); l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 7.<-----------
        // ____****
        // ___****
        // __****
        // _****
        // ****

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= (5 - i + 1); j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= 5; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 8.<-----------
        // ____*
        // ___***
        // __*****
        // _*******
        // __*****
        // ___***
        // ____*

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= (4 - i + 1); j++) {
        // System.out.print("_");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // for (int k = 2; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("_");
        // }
        // for (int k = 1; k <= (4 - i + 1); k++) {
        // System.out.print("*");
        // }
        // for (int k = 2; k <= (4 - i + 1); k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }???

        // Practice
        // 1.
        // ___1
        // __2 2
        // _3 3 3
        // 4 4 4 4

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= (4 - i + 1); j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // 2.
        // ___1
        // __212
        // _32123
        // 4321234

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int k = i; k >= 1; k--) {
        // System.out.print(k);
        // }
        // for (int l = 2; l <= i; l++) {
        // System.out.print(l);
        // }
        // System.out.println();
        // }
    }
}
