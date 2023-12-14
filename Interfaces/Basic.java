package Interfaces;
// Basicaly In the java you can not make single class through inheritance or abstract class

// BUT
// In the inheritance you can mack the through multiple class interface one single class.
// through interface you can inherits the multiple parent classes in to sub classes.
// for that you need to use "implements" keyword
// Interface ka object nahi ban sakta lekin refrence ban sakta he.
// You need to implement all the interface classes in your sub class like they are work as abstract method

interface Bicycle {
    int a = 45;
    public int b = 8;

    public void applyBreak(int decrement); // in the interface all the method are by default public either you write or
                                           // not is not issue

    public void speedUp(int increment);
}

interface horn {
    void BlowHorn();
}

class AvonBicycle implements Bicycle, horn {
    int speed = 7;

    // int b=8 ; // There is no need to do a public define variable Override in your
    // child class.
    // But method must be Override in your child class either it is public or not.
    public void applyBreak(int decrement) { // jo bhi method interface me he usko apko public define krna padega.
        speed = speed - decrement;
        System.out.println("Speed is " + speed);
    }

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed is " + speed);
    }

    public void BlowHorn() {
        System.out.println("Its horn...");
    }
}

public class Basic {
    public static void main(String[] args) {
        // We are mack here one bicycle EXAMPLE

        AvonBicycle ab = new AvonBicycle();
        ab.applyBreak(9);

        // You can creat properties in Interfaces.
        System.out.println(ab.a); // Allowed

        // You can not Modify properties in interface as they are final.
        // ab.a=34; // Not Allowed
        // Because it is always final keyword with the interfaces means all property
        // which you make in Interface is final.
    }
}
