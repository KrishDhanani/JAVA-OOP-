package OOP;
// basically we do here create class and method and called this method from another class.

class calculator{

    public int sum(int x,int y){

        int r = x + y;
        return r;

    }

}

public class demo {
    public static void main(String[] args) {
    
        int num1=6;
        int num2=6;

        calculator cu = new calculator(); // creating for locate class its object

        int result=cu.sum(num1,num2); // called that class through variable and pass some value. 

        System.out.println(result);
        
    }
}
    // Object oriented Programming
    // Object - Properties and behaviour
    // every thing around you is object like a.c. remote is object ; and it has number of buttons 
    // this buttons called as properties and by press on button it starts the a.c. it's behaviour.
