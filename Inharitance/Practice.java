package Inharitance;
// Create a class of animal and deraived another class dog from it.

class Animal{
   public String St ;

   public void setname(String u){
    St = u;
   }
   public String getname(){
    System.out.println("It's the class of Animal");
    return St;
   }
}

class dog extends Animal{
    String h;

    public void setname1(String j){
        h = j;
    }
    public String getname1(){
        System.out.println("It's the class of dog");
        return h;
    }
}

public class Practice {
    public static void main(String[] args) {
        Animal a = new Animal();
        



        
        a.setname("Doggy");
        System.out.println(a.getname());

        dog d = new dog();

        d.setname("Tommy");
        System.out.println(d.getname());

        d.setname1("Sheru");
        System.out.println(d.getname1());
    }
}
