package Interfaces;

interface class1 {
    void c1();

    void c2();
}

// class class2 extends class1{} <-- Not Alowed
interface class2 extends class1 {
    void c3();

    void c4();
}

public class Interface_with_Inheritance implements class2 {
    // You can not make new class from extends interface
    // But
    // You can make new Interface to extends parent Interface
    // Also
    // One interface class can not implement another interface class.

    public void c1() {
        System.out.println("c1");
    }

    public void c2() {
        System.out.println("c2");
    }

    public void c3() {
        System.out.println("c3");
    }

    public void c4() {
        System.out.println("c4");
    }

    public static void main(String[] args) {
        Interface_with_Inheritance c = new Interface_with_Inheritance();
        c.c1();
        c.c2();
        c.c3();
        c.c4();
    }
}

// public interface Interface 1 {
// void meth1 ();
// }

// public interface Interface 2 extends Interface 1 {
// void meth 2( );
// }