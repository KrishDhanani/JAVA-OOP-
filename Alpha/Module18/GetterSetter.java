package Alpha.Module18;

public class GetterSetter {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setpassword(123);
        System.out.println(ba.getpassword());
    }
}

class BankAccount {
    public String UserName;
    private int Password;

    public void setpassword(int Password) {
        this.Password = Password;
        // this keyword is mainly use when same name of variable
        // Ex.in the instance variable name = argument variable name
    }

    public int getpassword() {
        return this.Password;

    }
}
