package Inharitance;
// For copy the part of another class we just write " 'extends' classname".

// help in reusability of code

// Types of inheritance:
// 1.Single inheritance: A-->B (here B extends A)
// 2.Miltiple inheritance: "Actually Java Not Support This Function"
// 3.Hirarical inheritance:  A<---B--->C (here A and C Extends B)
// 4.Multilevel inheritance: A--->B--->C (here B extends A and C extends B)

class Base {
    int x;

    public void printMe() {
        System.out.println("I am Constructor");
    }

    public void setnum(int c) {
        x = c;
    }

    public int getnum() {
        System.out.println("I am in Base and setting int X:");
        return x;
    }
}

class Derived extends Base {
    int y;

    public void setnumber(int v) {
        y = v;
    }

    public int getnumber() {
        System.out.println("I am in Base and setting int Y:");
        return y;
    }

}

class Basic {
    public static void main(String[] args) {
        // creating object of base class.
        Base b = new Base();

        b.setnum(5);
        System.out.println(b.getnum());

        // Creating object of derived class.
        Derived d = new Derived();

        d.setnum(9); // Bassically here class is derived and and geter and seter are copy the class
                     // of base.
        System.out.println(d.getnum());

        d.setnumber(10);
        System.out.println(d.getnumber());
    }
}