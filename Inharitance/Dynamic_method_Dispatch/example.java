package Inharitance.Dynamic_method_Dispatch;

class A {
    void hi() {
        System.out.println("hi");
    }
}

class B extends A {
    @Override
    void hi() {
        System.out.println("Hello");
    }
}

class example {

    public static void main(String[] args) {
        A a = new B();
        a.hi();
    }
}