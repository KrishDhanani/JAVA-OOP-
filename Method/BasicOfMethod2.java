package Method;

public class BasicOfMethod2 {
    // If there is no static method is there.
     int logic(int x,int y){
        int z;
        if(x<y){
            z = x+y;
            System.out.println("B is greater");
        }
        else{
            z = x*y;
            System.out.println("A is greater");
        }
        return z;
    }    

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c;

        BasicOfMethod2 obj = new BasicOfMethod2();
        c = obj.logic(a,b);

        System.out.println("c:" +c);
        // if(a<b){
        //     c = a+b;
        //     System.out.println("B is greater" + c);
        // }
        // else{
        //     c = a*b;
        //     System.out.println("A is greater" + c);
        // }

            int a1 = 6;
            int b1 = 3;
            int c1;
            
            c1 = obj.logic(a1,b1);
            System.out.println("c1: " + c1);
            // if(a1<b1){
            //     c1 = a1+b1;
            //     System.out.println("B is greater" + c1);
            // }
            // else{
            //     c1 = a1*b1;
            //     System.out.println("A is greater" + c1);
            // }


    }
}
