package Inharitance;
class EkClass{
    int a;

    int getA(){
        return a;
    }

    EkClass(int a){  // Bassically we are here use same name variable in the program so it's nesessary to use this keyword.
        this.a = a;
    }

    public int returnone(){
        return 1;
    }   
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am DoClass Constructor with value:- "+ c );
    }
}

public class This_Super {  // It's shows why we need to use this and super keyword.
    public static void main(String[] args) {
        EkClass e = new EkClass(6);
        System.out.println(e.getA());
        DoClass d = new DoClass(8);
    }
}
