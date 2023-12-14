package Threding;

// here we see how we can implement thread using method: "Extending Thread clss"
// we can create here through "extends Thread" <--Keyword
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("I am Thread 1");
            System.out.println("I am good");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() { // <-- This method is override by the thread.java
        int i = 0;
        while (i < 200) {
            System.out.println("I am Thread 2");
            System.out.println("I am bad");
            i++;
        }
    }
}

public class Basic1 {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();

        // th1.run(); // for start thread we not use here method name for calling
        // we use predefine start method name which invoke every method
        // Also if you write like th1.run then it exicute full method of the run after
        // it is go for exicute another class run method.
        th1.start();
        th2.start();
    }
}
