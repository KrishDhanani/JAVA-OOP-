package loop.Pattern;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AlphaMod9 {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4 - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 1
        // 12
        // 123
        // 1234
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // A
        // AB
        // ABC
        // ABCD
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int character = 1; character <= line; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
