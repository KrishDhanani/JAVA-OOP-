package Alpha.Module18;

public class Constructor {
    public static void main(String[] args) {
        // Non parameterized
        Student s = new Student();

        // parameterized
        Student s1 = new Student("Krish");
        System.out.println(s1.name);

        // Copy Constructor
        Student s2 = new Student();
        s2.name = "krish";
        s2.roll = 13;
        s2.Password = "abc";
        s2.marks[0] = 1;
        s2.marks[1] = 2;
        s2.marks[2] = 3;

        Student s3 = new Student(s2); // copy
        s3.Password = "def";
        // s1.marks[2] = 4;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String Password;
    int marks[];

    // Non parameterized
    Student() {
        System.out.println("Default constructor...");
    }

    // Parameterized
    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.roll = s2.roll;
    }

}
