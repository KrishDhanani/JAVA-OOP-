package Package;

// import java.util.Scanner;
// Here we are import Scanner Object From util Package

// import java.util.*;
// Here we are import all thewhich is inside the util Package.

public class Basic {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Another way of Use Packages.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
    }
}

// How to do One class file seperate folder So that if you want to Share your
// code to Other computer that time Just send This class file folder.
// Syntax:
// javac -d . file_name.java
// ex.
// javac -d . Basic.java <--- Here in my Package class file folder i want only
// one Basic.java file i want transfer
// if i want all file transfer into pacakge class folder thst time just write
// javac -d . *.java <--- It transfer all the file into class file folder
