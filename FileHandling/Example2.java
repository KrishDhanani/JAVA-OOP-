package FileHandling;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream f = new FileInputStream("hi.txt");

        int data1 = f.read();
        int data2 = f.read();
        int data3 = f.read();

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
??? 
        f.close();

    }
}
