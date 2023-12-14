public class TypePrmotion {
    public static void main(String[] args) {

        // 1.java automatically promotes each byte,short or char operand to int when
        // evaluating expression.
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);
        System.out.println(a - b);

        // 2. if one operand is long,float or double the whole expression is promoted to
        // long,float or double respectively.
        int c = 10;
        float d = 20.5f;
        long e = 90;
        double f = 78.9;
        double ans = c + d + e + f;
        System.out.println(ans);
    }
}
