package Access_Modifier;
// Finding circle area , radious , and perimeter.
import java.util.Scanner;
import java.lang.Math;
class Circle{

   private int radious;
   private double area;
   private double perimeter;

   public void circle(int r){
    radious  = r;
    area = Math.PI*r*r;
    perimeter = 2*Math.PI*r;
   }

    
    public int getRadious(){
        return radious;
    }

    
    public double getarea(){
        return area;
    }

    
    public double getperimeter(){
        return perimeter;
    }

    


}

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Circle c = new Circle();

        System.out.println("Enter radious");
        int o = sc.nextInt();
        
        System.out.println(c.getRadious());
        System.out.println(c.getarea());
        System.out.println(c.getperimeter());
    }
}
