package Inharitance.Dynamic_method_Dispatch;

class Phone {

    public void ShowTime() {
        System.out.println("Time is 8am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing Music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class Basic {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone obj2 = new SmartPhone(); // Allowed

        // whenever you make object and write "new" keyword then the object made at RUN
        // Time.
        Phone obj = new SmartPhone(); // Allowed
        // If your Reference is from super class and object is from subclass the you can
        // mack it.
        // but
        // SmartPhone obj2 = new Phone(); // Not Allowed
        // If your Reference is from sub class and object is from super class then you
        // can "not" mack it.

        obj.ShowTime();
        obj.on(); // Here Object method is Run.(sub class method is run)
        // obj.music(); // Not Allowed

        // Bassically all superclass method is run but when same name method is exst in
        // super and sub class the and then sub class method is run other wise no method
        // is run from sub class.
        /*
         * or Also it's like the "obj" object through you can only call super class all
         * normal method and "obj" object through you
         * can call all the subclass override method.
         * It mean that from smart phone class all the override method ayegi or from
         * phone class all the normal class ayegi.
         */
    }
}
