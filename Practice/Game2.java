package Practice;

import java.io.*;
import java.util.*;

class Library {

    Scanner sc = new Scanner(System.in);
    String AvailableBook[];

    void addBook(int x) {
        String[] Book = new String[x];

        System.out.println("Write Book name Which Book you want to insert: ");

        for (int i = 0; i < Book.length; i++) {
            Book[i] = sc.nextLine();
            System.out.println(Book[i] + "* has been added");
        }

        String AvailableBook[] = new String[x];
        System.out.println("Book's are:");

        for (int i = 0; i < Book.length; i++) {
            System.out.print(Book[i] + " ");
            AvailableBook[i] = Book[i];
        }
    }

??
    void issueBook(int y) {

        String[] issueBook = new String[y];

        System.out.println("Write name of Book you want to issue: ");
        for (int i = 0; i < issueBook.length; i++) {
            issueBook[i] = sc.nextLine();
        }

        System.out.println("Your issue Book is:");
        for (int i = 0; i < issueBook.length; i++) {
            System.out.print(issueBook[i] + " ");
            if (AvailableBook[i].equals(issueBook[i])) {
                AvailableBook[i] = null;
            }
        }

        System.out.println("Available books are in Library:");
        for (int i = 0; i < AvailableBook.length; i++) {
            System.out.println(AvailableBook[i]);
        }
    }

    void returnBook(int z) {

        String[] returnBook = new String[z];

        System.out.println("Write name of Book you want to return: ");
        for (int i = 0; i < returnBook.length; i++) {
            returnBook[i] = sc.nextLine();
        }

        System.out.println("Your return Book is:");
        for (int i = 0; i < returnBook.length; i++) {
            System.out.print(returnBook[i] + " ");
        }
    }

    // void showAwailableBook() {
    // String[] showAwailableBook = new String[5];
    // System.out.println("The available Books in the library are: ");
    // for (int i = 0; i < Book.length; i++) {
    // ABook[i] = Book[i] - issueBook[i];
    // }
    // for (int i = 0; i < ABook.length; i++) {
    // System.out.println(ABook[i] + " ");
    // }
    // }
}

class Game2 {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        Library l = new Library();

        System.out.println("\nHow many book you want to add: ");
        int x = sy.nextInt();
        l.addBook(x);

        System.out.println("\nHow many book you want to issue: ");
        int y = sy.nextInt();
        l.issueBook(y);

        System.out.println("\nHow many Book you want return: ");
        int z = sy.nextInt();
        l.returnBook(z);
        // l.showAwailableBook();
    }
}