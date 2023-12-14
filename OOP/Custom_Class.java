package OOP;

// Int the program only one class can have public type.
class Employee{

    int id;
    String name;
    void details(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class Custom_Class {    
    public static void main(String[] args) {

        System.out.println("It's Our custom class");
        Employee e = new Employee(); //Instantiating new Employee Object
        Employee b = new Employee(); 
       
        // Setting properties
        e.id=6;
        e.name="Krish";

        b.id=7;
        b.name="Yash";

        // Printing the argument
        e.details();
        b.details();
        
        // System.out.println(e.id);
        // System.out.println(e.name);
    
    }
}
