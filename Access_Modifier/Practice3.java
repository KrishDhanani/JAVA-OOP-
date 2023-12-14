package Access_Modifier;
/*
 * Overload a constructor to initialize a rectangle
 * of length 4 and breadth 5 for using costom parameter.
 */
public class Practice3 {  //here we are use ractangle name as the practice3.
   private int length;
   private int breadth;
    public Practice3(){
        length = 4;
        breadth = 5;
       System.out.println("length: "+length+" breadth: "+breadth);
    }
    
    public static void main(String[] args) {
        Practice3 p = new Practice3();
    }
}
