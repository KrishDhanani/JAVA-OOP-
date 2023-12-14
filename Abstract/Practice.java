
//1.

/*
 * Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. 
 * Call the methods 'message' by creating an object for each subclass.
 */

package Abstract;

// abstract class parent {
//     abstract public void message();
// }

// class parent1 extends parent {
//     @Override
//     public void message() {
//         System.out.println("This is first subclass");
//     }
// }

// class parent2 extends parent {
//     @Override
//     public void message() {
//         System.out.println("This is second subclass");
//     }
// }

// public class Practice {
//     public static void main(String[] args) {
//         parent1 p1 = new parent1();
//         p1.message();
//         parent2 p2 = new parent2();
//         p2.message();
//     }
// }
// NOTE::: In 1. program vs code issue is there
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//2.
/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'.
 *  $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
 * each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
 */

// abstract class Bank {
//     abstract public int getBalance();
// }

// class BankA extends Bank {
//     int a = 100;

//     public int getBalance() {
//         System.out.println("I am Bank A:-");
//         return a;
//     }
// }

// class BankB extends Bank {
//     int b = 150;

//     public int getBalance() {
//         System.out.println("I am Bank B:-");
//         return b;
//     }
// }

// class BankC extends Bank {
//     int c = 100;

//     public int getBalance() {
//         System.out.println("I am Bank C:-");
//         return c;
//     }
// }

// class Practice {
//     public static void main(String[] args) {
//         BankA b1 = new BankA();
//         System.out.println(b1.getBalance() + "$");

//         BankB b2 = new BankB();
//         System.out.println(b2.getBalance() + "$");

//         BankC b3 = new BankC();
//         System.out.println(b3.getBalance() + "$");

//     }
// }
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//3.
/*
 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and 
 * in four subjects (each out of 100) by student B.
 *  Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 * It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
 *  The constructor of student A takes the marks in three subjects as its parameters and
 *  the marks in four subjects as its parameters for student B.
 *  Create an object for each of the two classes and print the percentage of marks for both the students.
 */

// import java.util.Scanner;

// abstract class Marks {
//     abstract public void getPercentage();
// }

// class StdA extends Marks {
//     int a;
//     int b;
//     int c;

//     StdA(int x, int y, int z) {
//         a = x;
//         b = y;
//         c = z;
//     }

//     @Override
//     public void getPercentage() {
//         float d = a + b + c;
//         float e = (d * 100) / 300;
//         System.out.println("Student A Final Persentage is:" + e + "%");
//     }
// }

// class StdB extends Marks {
//     int x, y, z, w;

//     StdB(int a, int b, int c, int d) {
//         x = a;
//         y = b;
//         z = c;
//         w = d;
//     }

//     @Override
//     public void getPercentage() {
//         int f = x + y + z + w;
//         float h = f * 100 / 400;
//         System.out.println("The persentag of Student B is:" + h + "%");
//     }
// }

// class Practice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Student \"A\""); // Here for doing Perenthisis("") use ago the paranthisis \ <-- icon.
//         System.out.println("Enter Student A Three subject Marks(Out of 100 Marks per subject):");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         StdA a1 = new StdA(a, b, c);
//         a1.getPercentage();

//         System.out.println("Student \"B\""); // Here for doing Perenthisis("") use ago the paranthisis \ <-- icon.
//         System.out.println("Enter Student B Four subject Marks(Out of 100 Marks per subject):");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();
//         int w = sc.nextInt();

//         StdB a2 = new StdB(x, y, z, w);
//         a2.getPercentage();
//     }
// }
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//4.
/*
 * An abstract class has a construtor which prints "This is constructor of abstract class", 
 * an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". 
 * A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
 *  Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
 */

// abstract class One {
//     One() {
//         System.out.println("This is constructor of abstract class");
//     }

//     abstract public void a_method();

//     public void aa_method() {
//         System.out.println("This is a normal method of abstract class");
//     }
// }

// class Subclass extends One {
//     // @Override
//     // public void aa_method() {
//     //     System.out.println("This is a normal method of Subclass class");
//     // }

//     public void a_method() {
//         System.out.println("This is abstract method");
//     }
// }

// class Practice {
//     public static void main(String[] args) {
//         Subclass sb = new Subclass();
//         sb.aa_method();
//     }
// }
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//5.
/*
 * Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
 *  Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
 *  both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
 */

// abstract class Animal {

//     abstract public void cats();

//     abstract public void dogs();
// }

// class Cats extends Animal {

//     public void dogs() {
//     }

//     public void cats() {
//         System.out.println("Cats meow");
//     }
// }

// class Dogs extends Animal {
//     public void cats() {
//     }

//     public void dogs() {
//         System.out.println("Dogs bark");
//     }
// }

// class Practice {
//     public static void main(String[] args) {
//         Cats c = new Cats();
//         Dogs d = new Dogs();
//         c.cats();
//         d.dogs();
//     }
// }
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
// 6.
/*
 *  We have to calculate the area of a rectangle, a square and a circle.
 *  Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
 *  'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, 
 *  that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
 *  Now create another class 'Area' containing all the three methods 'RectangleArea', 
 *  'SquareArea' and 'CircleArea' for printing the area of rectangle, 
 *  square and circle respectively. 
 *  Create an object of class 'Area' and call all the three methods.
 */
import java.lang.Math;

abstract class shape {
    abstract public void RactangleArea(int length, int breadth);

    abstract public void SquareArea(int side);

    abstract public void CircleArea(int radius);
}

class Area extends shape {
    public void RactangleArea(int length, int breadth) {
        System.out.println("Rcatangle Area:- " + length * breadth);
    };

    public void SquareArea(int side) {
        System.out.println("Square Area:- " + side * side);
    };

    public void CircleArea(int radius) {
        System.out.println("Circle Area:- " + Math.PI * radius * radius);
    };
}

class Practice {
    public static void main(String[] args) {
        Area a = new Area();
        a.RactangleArea(5, 10);
        a.SquareArea(2);
        a.CircleArea(2);
    }
}