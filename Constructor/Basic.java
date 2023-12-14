package Constructor;
//  It's not right way to again again make new getter and setter so that we are use here Constructor. 
// Construstor is similor to method but they are used to initialize an object.
// It's do not have any return type like void , int.
// Every time we create an object by using the new() keyword , a constructor is called
// Rules:- class naME AND constructor should be same;
//          it's not have return type
//          it can not be abstract , static , final , and Syncronize.
// Constructor name and class name must be same.


// Getter & Setter through

// class New{
//     private int  id;
//     // private String name;

//     public  void setid(int a){
//          id = a;
//     } 
//     public int getid(){
//         return id;
//     }
// }
// public class Basic {
//     public static void main(String[] args) {
//         New n = new New();
//         n.setid(9989);
//         System.out.println(n.getid());
//     }
// }
// --------> Basically upper side program is through getter and setter.

//  --------> now from constructor.


// 1.
class New{
    private int id;
    private String name;

    public New(){
       id=9;                  // Through constructor you can initialize in constructor.(NO NEED TO USE SETTER AND IN MAIN METHOD WRITE ARGUMENT)
       name="krish"; 
       System.out.println(name);
       System.out.println(id);
    }
    // public int getid(){
    //     return id;
    // }
    // public String getname(){
    //     return name;
    // }
// }
// class Basic{
    public static void main(String[] args) {
        New n = new New();
        // System.out.println(n.getid());
        // System.out.println(n.getname());
        
    }
}


// 2.
// class New{
//     private int id;
//     private String name;
//     public New(){
//        id=9;                  
//        name="krish"; 
//        System.out.println(id);
//        System.out.println(name);
//     // }
//     // public int getid(){
//     //     return id;
//     // }
//     // public String getname(){
//     //     return name;
//     }
// }
// class Basic{
//     public static void main(String[] args) {
//         New n = new New();         // You can pass the value in the with intiating object.
//         // System.out.println(n.getid());
//         // System.out.println(n.getname());
//     }
// }