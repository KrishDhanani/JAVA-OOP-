package Inharitance;

class A {
    public int a;

    public int Math1() {
        return 1;
    }

    public void Math2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    // for getting output of "I am method 2 of class B"
    @Override
    public void Math2() { // It's Method Overriding.
        System.out.println("I am method 2 of class B");
    }

    public void Math3() {
        System.out.println("I am method 3 of class B");
    }
}

public class Method_Overwrride {
    public static void main(String[] args) {
        A a = new A();
        a.Math1();
        a.Math2();

        B b = new B();
        b.Math2();
    }
}
