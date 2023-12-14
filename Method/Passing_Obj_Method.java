package Method;

// Through Passing the object we can create one class and use that class all 
// the variable and method in other class through passing the object of class one to second class.
class abc { // Use this class in other class
    int a = 10;
    int b = 20;
}

class xyz {
    void setvalue(abc aa) { // We write here first class name after object name
        aa.a = 20; // set new value a
        aa.b = 30; // set new value b
    }

    void print(abc aa) {
        System.out.println("a:" + aa.a + " b:" + aa.b);
    }
}

public class Passing_Obj_Method {
    public static void main(String[] args) {
        abc aa = new abc();
        xyz o = new xyz();
        o.setvalue(aa); // We write here only object name which we want to pass.
        o.print(aa);
    }
}
