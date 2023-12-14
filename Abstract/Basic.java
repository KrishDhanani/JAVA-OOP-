package Abstract;

// 1.Abstract method 

// A method is define without implimentation and curly Parenthisis.
// Ex.
//abstract void moveTo(int a , int b); 

// 2. Abstract class 

//if a class include Abstract Method, then the class itself must be declare Abstract as in:
// Ex.
//  public abstract class phonemodel{
//     abstract void switchoff();
//     //more code
//  }

abstract class Parent {
    public Parent() {
        System.out.println("MAi Base ka Constructor hu");
    }

    public void sayHello() {
        System.out.println("Hello!!");
    }

    abstract public void greet(); // Ak method puri class ko abstract bna deti he.
}

class child extends Parent {
    /*
     * NOTE: When you extend the abstract class that time if you not override all
     * the abstract method in sub class then again your sub class work as abstract
     * class.
     */
    @Override
    public void greet() { // Whenever extends you Abstract class that time you can not use "static"
                          // modifier in method.
        System.out.println("Good morning!");
    }
}

abstract class child1 extends Parent {
    public void th() {
        System.out.println("I am Good");
    }
}

public class Basic {
    public static void main(String[] args) {

        // Parent p = new Parent(); // You can not mack abstract class object.
        // also
        // You can not mack child class object which is extends abstract class
        // like
        // child1 c = new child1();
        // but

        child ch = new child();
        ch.greet();
    }
}
