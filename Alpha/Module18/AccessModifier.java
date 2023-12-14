package Alpha.Module18;

// For see which mmodifier is access in which field just refer the notes
public class AccessModifier {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.UserName = "krish";
        // ba.Password=123; //throw error because It's private

        ba.setpassword(123);
        // You change Password

        // System.out.println(ba.Password);
        // Again you can not access this because It's private property.
    }
}

class BankAccount {
    public String UserName;
    private int Password;

    public void setpassword(int x) {
        Password = x;
    }
}