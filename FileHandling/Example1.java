package FileHandling;

import java.util.Scanner;
import java.io.*;

class Example1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner input = new Scanner(new File("hi.txt"));
        while (input.hasNextInt()) {
            System.out.println(input.nextInt() + " ");
        }
        System.out.println();
    }
}