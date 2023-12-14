package Interfaces;

// 1. create abstract class Pen with method Write() and Refil() as Abstract
// method
// abstract class Pen {
// abstract void Write();

// abstract void Refil();
// }

// public class Questions_Harry extends Pen {
// public void Write() {
// System.out.println("I can write");
// }

// public void Refil() {
// System.out.println("I can Refil");
// }

// public static void main(String[] args) {
// Questions_Harry q = new Questions_Harry();
// q.Write();
// q.Refil();

// }
// }

// 2. Use the pen class from Q1 to create a concreat class Fountain pen with
// additional method changeNib().
// abstract class Pen {
// abstract void Write();

// abstract void Refil();
// }

// class FountainPen extends Pen {
// void Write() {
// System.out.println("Fountain Pen Write");
// }

// void Refil() {
// System.out.println("Fountain Pen Refil");
// }

// void changeNib() {
// System.out.println("Changing Nible...");
// }
// }

// public class Questions_Harry {
// public static void main(String[] args) {
// FountainPen fp = new FountainPen();
// fp.Write();
// fp.Refil();
// fp.changeNib();
// }
// }

// 3. Create class Monkey With jump() and Bite() Method.Create class Human which
// Inherits this Monkey class and Implement BasicAnimal interface with eat() and
// sleep() methods.

// class Monkey {
// public void jump() {
// System.out.println("Monkey jumping...");
// }

// public void Bite() {
// System.out.println("Monkey Bite the Banana");
// }
// }

// interface BasicAnimal {
// void eat();

// void sleep();
// }

// class Human extends Monkey implements BasicAnimal {
// public void eat() {
// System.out.println("eating human...");
// }

// public void sleep() {
// System.out.println("sleeping Human...");
// }

// @Override
// public void jump() {
// System.out.println("Jumping human...");
// }
// }

// class Questions_Harry {
// public static void main(String[] args) {
// Human h = new Human();
// h.eat();
// h.Bite();
// h.jump();
// h.sleep();

// }
// }

// 4. Demonstrate Polymorphism Using Monkey class from Question3.
// class Monkey {
// public void jump() {
// System.out.println("Monkey jumping...");
// }

// public void Bite() {
// System.out.println("Monkey Bite the Banana");
// }
// }

// interface BasicAnimal {
// void eat();

// void sleep();
// }

// class Human extends Monkey implements BasicAnimal {
// public void speak() {
// System.out.println("Human speak...");
// }

// public void eat() {
// System.out.println("eating human...");
// }

// public void sleep() {
// System.out.println("sleeping Human...");
// }

// @Override
// public void jump() {
// System.out.println("Jumping human...");
// }
// }

// class Questions_Harry {
// public static void main(String[] args) {
// Monkey m1 = new Human(); // You can run only monkey class method.
// // Here the reference is monkey class and we create object of human class.
// // m1.speak(); <-- Cannot use speak method because the reference is monkey
// // and it does not have speak method.
// m1.jump();

// BasicAnimal b = new Human();
// // b.speak(); <-- Again Cannot use speak method because the reference is
// // BasicAnimal does not have speak method.
// b.sleep();
// }
// }

// 5. Create a class TElephone with ring() , lost() and diaconnect() method as
// Abstract method. Create another class SmartTelephone and demonstrate
// polymorphism.

// abstract class Telephone {
// abstract void ring();

// abstract void lost();

// abstract void disconnect();
// }

// class SmartTelephone extends Telephone {
// public void ring() {
// System.out.println("Ringing Telephone");
// }

// public void lost() {
// System.out.println("Lost Tlephone");
// }

// public void disconnect() {
// System.out.println("Disconnecting Telephone");
// }

// public void St() {
// System.out.println("I am SmartTelephone");
// }
// }

// class Questions_Harry {
// public static void main(String[] args) {
// Telephone t = new SmartTelephone();
// // t.St(); // <-- error give Because not follow Polymorphism rule
// t.ring();
// }
// }

// 6. Create an Interface TVRemote and use it to inherit another inteface
// SmartTvRemote.

// interface TvRemote {
// void name();
// }

// interface SmartTvRemote extends TvRemote {
// void name1();
// }

// class Operation implements SmartTvRemote {
// public void name() {
// System.out.println("I am TvRemote");
// }

// public void name1() {
// System.out.println("I am SmartTvRemote");
// }

// public void name2() {
// System.out.println("I am Operation");
// }
// }

// class Questions_Harry {
// public static void main(String[] args) {
// TvRemote tr = new Operation();
// // tr.name2(); // <- Not Allowed Because it Break Rule of Polymorphism
// tr.name();
// }
// }

// 7.Create a class Tv which implements TvRemote interface from Q6.

// interface TvRemote {
// void name();
// }

// interface SmartTvRemote extends TvRemote {
// void name1();
// }

// class Operation implements SmartTvRemote {
// public void name() {
// System.out.println("I am TvRemote");
// }

// public void name1() {
// System.out.println("I am SmartTvRemote");
// }

// public void name2() {
// System.out.println("I am Operation");
// }
// }

// class Tv implements TvRemote {
// public void name() {
// System.out.println("Ans is Done");
// }
// }

// class Questions_Harry {
// public static void main(String[] args) {
// TvRemote tr = new Operation();
// // tr.name2(); // <- Not Allowed Because it Break Rule of Polymorphism
// tr.name();
// }
// }