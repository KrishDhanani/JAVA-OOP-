package Alpha.Module18;

public class OOPBasic {
    public static void main(String[] args) {
        // public : keyword
        // static : Access specifier
        // void : return type
        // main : it needs always public and static method
        // args : name of String

        Pen p1 = new Pen();
        // Through "new" keyword inside heap give p1 object memory space for creating
        // properties of p1.

        p1.setColor("Blue");
        System.out.println(p1.Color);
        // We use "." operator to access any object properties or function.

        p1.setTip(5);
        System.out.println(p1.Tip);

        p1.Color = "Yellow";
        System.out.println(p1.Color);
    }
}

class Pen {
    String Color;
    int Tip;

    void setColor(String newColor) {
        Color = newColor;
    }

    void setTip(int newTip) {
        Tip = newTip;
    }
}

class student {
    String name;
    int age;
    int percentage;

    int calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
        return percentage;
    }
}
