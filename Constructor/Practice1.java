package Constructor;

import loop.practice1;

// Overload the employee constructor to initialize the salary to rs10,000.
public class Practice1{
    private int salary=10000;
    public Practice1(){
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Practice1 p = new Practice1();
        
    }
}
