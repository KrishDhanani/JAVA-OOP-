package Interfaces;

// 1.Create an interface named "Shape" with a method called "calculateArea()".
// Implement this interface in classes representing different shapes such as
// "Circle," "Rectangle," and "Triangle."
// Write a program to calculate and display the areas of different shapes.
// interface shape {
// void calculateArea();
// }

// class triangle implements shape {
// int blength, hlength;

// triangle(int x, int y) {
// this.blength = x;
// this.hlength = y;
// }

// @Override
// public void calculateArea() {
// int area = (blength * hlength) / 2;
// System.out.println("The Area of triangle: " + area);
// }
// }

// class Rectangle implements shape {
// int length, breadth;

// Rectangle(int x, int y) {
// this.length = x;
// breadth = y;
// }

// @Override
// public void calculateArea() {
// int area = length * breadth;
// System.out.println("Area of Rectengle: " + area);
// }
// }

// class circle implements shape {
// int radius = 10;

// public void calculateArea() {
// int area = (int) (Math.PI * radius * radius);
// System.out.println("The area of circle: " + area);
// }
// }

// public class ChatGpt_Question {
// public static void main(String[] args) {
// triangle t = new triangle(12, 2);
// t.calculateArea();

// Rectangle rectangle = new Rectangle(12, 2);
// rectangle.calculateArea();

// circle c = new circle();
// c.calculateArea();
// }
// }

// 2.Define an interface "Playable" with two methods: "play()" and "stop()."
// Implement this interface in classes representing different musical
// instruments such as "Piano," "Guitar," and "Flute." Write a program to play
// and stop various instruments.

// interface playable {
// void play();

// void stop();
// }

// class Piano implements playable {
// @Override
// public void play() {
// System.out.println("Playying piano...");
// }

// @Override
// public void stop() {
// System.out.println("Stop the piano...");
// }
// }

// class Guitar implements playable {
// @Override
// public void play() {
// System.out.println("Playying Guitar...");
// }

// @Override
// public void stop() {
// System.out.println("Stop the Guitar...");
// }
// }

// class Flute implements playable {
// @Override
// public void play() {
// System.out.println("Playying Flute...");
// }

// @Override
// public void stop() {
// System.out.println("Stop the Flute...");
// }
// }

// public class ChatGpt_Question {
// public static void main(String[] args) {
// playable p = new Flute(); // useind Dynamic method dispatch.
// p.play();
// p.stop();
// // Like that you can make for Piano,Guitar.
// }
// }

// 3.Create an interface "Animal" with a method called "makeSound()." Implement
// this interface in classes representing different animals such as "Cat,"
// "Dog," and "Lion." Write a program to make different animals' sounds.

// 4.Design an interface "Database" with methods for connecting to a database,
// executing queries, and closing the connection. Implement this interface in
// classes for different database systems such as "MySQL," "Oracle," and
// "SQLite."

// 5.Create an interface "Logger" with a method called "logMessage(String
// message)." Implement this interface in classes for different types of
// loggers, such as "ConsoleLogger," "FileLogger," and "DatabaseLogger." Write a
// program to log messages using different loggers.

// 6.Define an interface "Sortable" with a method called "sort(int[] array)."
// Implement this interface in classes that provide different sorting algorithms
// such as "BubbleSort," "SelectionSort","QuickSort" and "MergeSort." Write a program to
// sort an array using different algorithms.

interface Algorithm {
    void sort(int[] array);
}

// class BubbleSort implements Algorithm {
// @Override
// public void sort(int[] arr) {
// for (int i = 0; i < arr.length - 1; i++) {
// int first = arr[i];
// for (int j = 0; j < arr.length - 1 - i; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j + 1];
// arr[j + 1] = arr[j];
// arr[j] = temp;
// }
// }
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

class QuickSort implements Algorithm {
    public void sort(int[] arr) 
    if(){
        int l = 0;
        int pivot = 0;
        int r = arr.length - 1;

        while (l != r) {

            if (arr[pivot] > arr[r]) {
                int temp = arr[pivot];
                arr[pivot] = arr[r];
                arr[r] = temp;
            }

            else if (arr[l] < arr[pivot]) {
                l++;
            }

            else if (arr[pivot] < arr[l]) {
                int temp = arr[pivot];
                arr[pivot] = arr[l];
                arr[l] = temp;
            }

            else if (arr[pivot] < arr[r]) {
                r--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class ChatGpt_Question {
    public static void main(String[] args) {
        int[] array = { 2, 5, 3, 8, 6, 9 };
        // BubbleSort b = new BubbleSort();
        // b.sort(array);

        QuickSort q = new QuickSort();
        q.sort(array);
    }
}

// 7.Create an interface "Drawable" with a method called "draw()." Implement
// this interface in classes representing different graphic shapes such as
// "Circle," "Rectangle," and "Triangle." Write a program to draw different
// shapes on the screen.

// 8.Design an interface "Encryptor" with methods for encrypting and decrypting
// data. Implement this interface in classes for different encryption algorithms
// such as "CaesarCipher," "AES," and "RSA." Write a program to encrypt and
// decrypt data using different algorithms.

// 9.Create an interface "RemoteControl" with methods for turning on, turning
// off, and changing channels. Implement this interface in classes representing
// different types of remote controls such as "TVRemote," "DVDRemote," and
// "SetTopBoxRemote." Write a program to control different devices using
// different remotes.

// 10.Define an interface "Validator" with a method called "validate(String
// input)." Implement this interface in classes that provide different
// validation rules such as "EmailValidator," "PasswordValidator," and
// "PhoneNumberValidator." Write a program to validate user inputs using
// different validators.
// public class ChatGpt_Question {
// public static void main(String[] args) {

// }
// }
