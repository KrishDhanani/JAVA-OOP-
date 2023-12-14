package Access_Modifier;
// Total Four Modifier are ther:

// public , private , protected , default.

// 1.In Same Class You can USE public,private,protected,default
// 2.In Same Package You can use public,protected,default YOU CAN NOT USE "PRIVATE"
// 3. You go to Another Package and mack there subclass and inherit c1(This program) there THAT time you can use only public,protected can not use default and private.
// 4. Insted of this three categouries you are inside world that time only you can use public members and can not use  protected,default,private.
// for 3.&4. understand see harry video mo.66

class c1 {
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int w = 4;

    // Here we check that can we access all the modifier inside declared class
    public void m1() {
        // 1.
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}

public class Basic1 {

    public static void main(String[] args) {
        c1 c = new c1();
        c.m1();
        // 2.
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.w); // <-- Throws ERROR because It's Private modifier

    }
}
