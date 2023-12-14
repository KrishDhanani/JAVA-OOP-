package Inharitance;

// 1.Creat class circle find area and use inheritance to create another class
// cylinder and find it's volume from it.

// import java.lang.Math;
// class circle{
// public int radious;

// circle(int a){
// System.out.println("I am circle paramiterized cunstructor");
// this.radious=a;
// }
// public double area(){
// return Math.PI * this.radious * this.radious;
// }
// }

// class Cylinder extends circle{
// public int hight;

// Cylinder(int a,int b){
// super(a);
// System.out.println("I am Cylinder parameterized constructor");
// this.hight = b;
// }

// public double volume(){
// return Math.PI * this.radious * this.radious * this.hight;
// }
// }

// public class Practice2 {
// public static void main(String[] args) {
// circle ci = new circle(5);
// System.out.println(ci.area());

// Cylinder cy = new Cylinder(3 , 4);
// System.out.println(cy.volume());
// }
// }
















// 2.create class ractangle and use inheritance to create another class cuboid
// find it's area and volume through inheritance and repeat 1.
// j.j. Here i consider ractangle is same as cuboid.
// You can also use getter and setter in this code.

class ractangle {
public int length;
public int width;

ractangle(int a, int b) {
length = a;
width = b;
}

public void area() {
System.out.println(this.length * this.width);
}
}

class cuboid extends ractangle {
public int hight;

cuboid(int a, int b, int c) {
super(a, b);
hight = c;
}

public void volume() {
System.out.println(this.hight * this.length * this.width);
}
}

class Practice2 {
public static void main(String[] args) {
ractangle r = new ractangle(5, 6);
r.area();
System.out.println("\n");
cuboid g = new cuboid(5, 6, 7);
g.volume();

}
}