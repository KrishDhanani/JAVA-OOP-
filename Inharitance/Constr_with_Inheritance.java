package Inharitance;
// Basically here first base class constructor(without argument) run & then with argument

// constructor is run & then after Base1 constructor is run.

// class Base{
//     public int x;
//    
//     Base(){
//         System.out.println("I am constructor");
//     }
//     Base(int a){
//         System.out.println("I am Constructor with value a"+a);
//     }

//     public void setx(int a){
//         x=a;     
//     }

//     public int getx(){
//         return a;
//     }
// }

// class Base1 extends Base{
//    public int y;
//    Base1(){
//     //super(9);  // Through super keyword you can run first base constructor who has argument.
//     System.out.println("I am base1 class constructor");
//    }

//     public void sety(int b){
//         y=b;
//     }
//     public int gety(){
//         return y;
//     }
// }

// class Constr_with_Inheritance {
//     public static void main(String[] args) {
//         Base b = new Base();
//         Base b2 = new Base(7);
//         b.setx(8);
//         System.out.println(b.getx());
//         Base1 b1 = new Base1();
//     }
// }

// from harry website
class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        // super(0); // Through super keyword you can run first base constructor who has
        // argument.
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class Constr_with_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
