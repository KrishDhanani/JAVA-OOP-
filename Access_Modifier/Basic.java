package Access_Modifier;
// Access modifier are private,default,public,protected.

// we use for access modifier getter and setter in method.
// when write getter method it is always in the form of return.
// when write setter method it is not in the form of return.

class Employee {
    private int id;
    private String name;

    public void setname(String s) { // Basically it's first tack input from user and save it in private variable
                                    // after through getter it's print private variable value.
        name = s;
    }

    public String getname() {
        return name;
    }

    public void setid(int n) {
        id = n;
    }

    public int getid() {
        return id;
    }

}

public class Basic {
    public static void main(String[] args) {
        Employee e = new Employee();
        // e.id=9989;
        // e.name="krish"; ---> This two line gives error because of Access denite.

        e.setname("krish");
        System.out.println(e.getname());

        e.setid(9989);
        System.out.println(e.getid());
    }
}
