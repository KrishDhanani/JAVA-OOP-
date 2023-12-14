package Threding;

// We are create thread here by runnable interface. 
// We can create through "implements Runnable" <-- Keyword
class MyThread1 implements Runnable {
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("I am thread1");
            i--;
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("I am thread2");
            i--;
        }
    }
}

public class Basic2 {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
