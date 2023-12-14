package Interfaces;

interface Animal {
    // Default method
    // Actualy default method is use when you are forgot to add in interface class
    // one method and now you want to add that method but where where you implement
    // that class interface class(child class) there is error showing that you not
    // implement the method for that solution we can use "default" keyword through
    // it it's not necesary to implement or Override default method.
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void bark();
}

public class DefaultMethodConcept implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {

        DefaultMethodConcept obj1 = new DefaultMethodConcept();
        obj1.bark();
        obj1.say();
    }
}
