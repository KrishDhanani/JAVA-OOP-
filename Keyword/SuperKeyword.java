package Keyword;

// This class use for represent the variable,method and constructor of parent class so super keyword use in following ways:
// 1.To reffer variable of parent class
// 2.To reffer method of parent class
// 3.To reffer constructor of parent class
class A {
    int a = 10;

    A() {
        System.out.println("I am class A constructor");
    }

    void show() {
        System.out.println("I am class A");
    }
}

class B extends A {
    B() {
        super(); // <-- for getting class A constructor always write it in constructor of class B
                 // other wise not run.
    }

    void print() {
        System.out.println(super.a); // <-- For variable
        super.show(); // <-- For method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
