package OOP;

import java.util.Scanner;
import java.lang.Math;

//1...
// class Employee{
//     int salary;
//     String name;
//     String setname;
//     public static int getsalary(int i){
//         int salary;
//         salary = i;
//         return salary;
//     }

//     public String getName(){
//         return name;
//     }

//     public String setName(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter new name");
//          setname = sc.nextLine();
//         name=setname;
//         return name;
//     }

// }
// public class Practice1 {
//     public static void main(String[] args) {
//         Employee e = new Employee(); // initiating object

//         System.out.println("Enter the salary");

//         e.getsalary(90);
//         // e.getName("krish");
//     }    
// }

//2....
// create class cellphone with different method ringing... vibrating.... etc.

// class cellphone{
//     public static void ring(){
//         System.out.println("Ringing...");
//     }
//     public static void vibrate(){
//         System.out.println("Vibrating...");
//     }
//     public static void callFriend(){
//         System.out.println("Some one calling You...");
//     }
// }

//     public class Practice1{

//     public static void main(String[] args) {
//         cellphone c = new cellphone();
//         c.ring();
//         c.vibrate();
//         c.callFriend();
//     }
// } 

// 3.....
// create class squre with a method to initialize it's side, calculating area, perimeters etc.

// class squre{
//     public static int area(int a){
//         return a*a;
//     }
//     public static int perimeter(int a){
//         return 4*a;
//     }
// }
// public class Practice1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the side of squre");
//         int x = sc.nextInt();
//         squre q = new squre();
//         int c=q.area(x);
//         System.out.println("The area is:"+c);
//         System.out.println("The perimeter of squre:" + q.perimeter(x));
//     }
// }

// 4...
// create class rectangle with a method to initialize it's side, calculating area, perimeters etc.

// class rectangle{
//         public static int area(int a, int b){
//             return a*b;
//         }
//         public static int perimeter(int a, int b){
//             return 2*(a+b);
//         }
//     }
//     public class Practice1{
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the length of rectangle");
//             int x = sc.nextInt();

//             System.out.println("Enter the width of rectangle");
//             int y = sc.nextInt();

//             rectangle q = new rectangle();
//             int c=q.area(x,y);
//             System.out.println("The area is:"+c);
//             System.out.println("The perimeter of rectangle:" + q.perimeter(x,y));
//         }
//     }

// 5.....
//create class tomyvecetti for rock star game capable of hiting(print hiting...), running, firing etc. 

class tomyvecetti {
    public static void hiting() {
        System.out.println("Hiting...");
    }

    public static void running() {
        System.out.println("Running...");
    }

    public static void firing() {
        System.out.println("Firing...");
    }
}

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you want: hiting(write hi),firing(write fi),running(write ru): ");
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();
        tomyvecetti t = new tomyvecetti(); 
        String hi = x;
        String fi = y;??????
        String ru = z;
        if( x == hi){
            t.hiting();
        }
        else if(y==fi){
            t.firing();
        }
        else if (z==ru){
            t.running();
        }
        else{
            System.out.println("Error");
        }
        // String h = sc.nextLine();
        // String f = sc.nextLine();
        // String r = sc.nextLine();

    }
}

// 6...
// create class circle with a method to initialize it's radious, calculating
// area, perimeters etc.

// class circle{
// public static double area(float r){
// return Math.PI*r*r;
// }
// public static double perimeter(float a){
// return 2*Math.PI*a;
// }
// }
// public class Practice1{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the radious of circle");
// float x = sc.nextFloat();

// circle q = new circle();
// double c=q.area(x);
// System.out.println("The area is:"+c);
// System.out.println("The perimeter of rectangle:" + q.perimeter(x));
// }
// }
