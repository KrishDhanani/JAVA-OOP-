package Access_Modifier;
// 1.Create class Cylinder and use Getter & Setter to sets it's Radious and Hight.

// 2.Now using 1 Calculate surface area and volume of cylinder. 

// import java.lang.Math;
// class Cylinder{
//     private int Radious;
//     private int Hight;
    
//     public void setRadious(int n){
//         Radious = n;
//     }
//     public int getRadious(){
//         return Radious;
//     }

//     public void setHight(int n){
//         Hight = n;
//     }
//     public int getHight(){
//         return Hight;
//     }
//     public Double area(){
//        Double area = 2*Math.PI*Radious*Hight*(Radious+Hight);
//        return area;
//     }
//     public Double volume(){
//         double volume = Math.PI*Radious*Radious*Hight;
//         return volume;
//     }
    
// }

// public class Practice2 {
//     public static void main(String[] args) {
//         Cylinder c = new Cylinder();
//         c.setRadious(9);
//         System.out.println("The Radious is: "+c.getRadious());
        
//         c.setHight(12);
//         System.out.println("The Hight is: "+c.getHight());
    
//         System.out.println("The area is: "+c.area());
//         System.out.println("The volume is: "+c.volume());
//     }
// }

// Use Constructor and Repeat 1.

public class Practice2{    //here we are use Cylinder as practice2(name)
    private int radious;
    private int hight;
    public Practice2(int r,int h){
        radious = r;
        hight = h;
        System.out.println("The Radious is:"+radious);
        System.out.println("The hight is: "+hight);
    }
    public static void main(String[] args) {
        Practice2 p = new Practice2(8,9);
    }
}