package FileHandling;

import java.io.*;
import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random rand = new Random();
        try {
            FileOutputStream f = new FileOutputStream("123.txt");
            PrintWriter pw = new PrintWriter(f, true);
            for (int i = 0; i < 150; i++) {
                pw.print(rand.nextInt(100) + " ");
            }
            pw.flush(); // Manually flush the PrintWriter
            System.out.println("Data Append");
        } catch (IOException io) {
            System.out.println("can not creat the file.");
            // io.printStackTrace();
        }
    }
}
