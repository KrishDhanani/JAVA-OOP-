package Arrays;

/*Write a program that creates an Array List and adds a Loan object, a Date object, a string, and
a Circle object to the list, and use a loop to display all elements in the list by invoking the
object’s toString() method. */
import java.util.*;
import java.util.Date;
import java.util.ArrayList;

class circle {
    int radious = 9;

    public String toString() {
        return "circle Radious " + radious;
    }
}

class loan {
    int l = 100;

    public String toString() {
        return "Loan " + l;
    }
}

class A_L {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        circle c = new circle();
        loan l = new loan();
        Date d = new Date();
        arr.add(c);
        arr.add(l);
        arr.add(d);
        for (int i = -0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
