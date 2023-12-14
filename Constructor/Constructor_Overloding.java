package Constructor;

public class Constructor_Overloding {
    private int id;
    private String name;

    Constructor_Overloding() {
        id = 1;
        name = "krish";
    }

    Constructor_Overloding(int num) {
        id = num;
    }

    Constructor_Overloding(String Myname) {
        name = Myname;
    }

    public static void main(String[] args) {
        // Constructor_Overloding co = new Constructor_Overloding(9);
        // System.out.println(co.id);

        // Constructor_Overloding co1 = new Constructor_Overloding("krish");
        // System.out.println(co1.name);

        Constructor_Overloding co2 = new Constructor_Overloding();
        System.out.println(co2.id + co2.name);
    }
}
