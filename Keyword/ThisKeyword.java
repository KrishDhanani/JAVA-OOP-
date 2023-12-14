package Keyword;

// This keyword use for ; when instance variable and pameter variable have same name that time it is use 
// Remember it This keyword can not use in static method 
public class ThisKeyword {
    int x = 10; // <-- As globle x value is 10

    public void work(int x) {
        this.x = x; // <-- x value is change to 20
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword();
        th.work(20);
    }
}
