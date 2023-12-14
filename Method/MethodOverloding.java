package Method;

public class MethodOverloding {
    static void telljoke(){    //we use here void because in this method no return are there. 
        System.out.println("You are beautiful");
    }

    //Case 1.
    static void change1(int x){
        x=98;
    }

    //Case 2.
    static void change2(int [] marks){
        marks[0]=98;
    }

    //Method over loading.
    static void aa(){
        System.out.println("hello bro!");
    }

    static void aa(int a) //Here "a" is our parameter. 
    {
        System.out.println("hello " + a + " bro!");
    }

    static void aa(int a , int b){
        System.out.println("hello " + a + " bro!");
        System.out.println("hello " + b + " bro!");
    }

    public static void main(String[] args) {
        // telljoke();

        // CASE 1. changing the intiger.
        // int a=11;
        // change1(a);
        // System.out.println("After change a:" + a);

        // CASE 2. changing the array.
        // int[] marks = {2,32,52,48,26,25,78};
        // change2(marks);
        // System.out.println("After the changing marks: " + marks[0]);
    
    
        // Method Overloding.(You can do method overloading by changing the method parameter)
        aa();
        aa(300); //Here 300 is argument.
        aa(300 , 400);
        // arguments are actual 
        /* NOTE :: You can do overloading by changing the onlu parameter ; 
        You can not do overloading by changing the argument or method type. */
    }
}
