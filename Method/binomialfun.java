package Method;

public class binomialfun {
    // public static void binomialFun(int n, int r) {

    // int factN = 1;
    // for (int i = n; i >= 1; i--) {
    // factN *= i;
    // }
    // System.out.println("factN is::" + factN);

    // int factR = 1;
    // for (int j = r; j >= 1; j--) {
    // factR *= j;
    // }
    // System.out.println("factR::" + factR);

    // int re = n - r;
    // int factRe = 1;
    // for (int k = 1; k <= re; k++) {
    // factRe *= k;
    // }
    // System.out.println("factRE is::" + factRe);

    // int result = factN / (factR * factRe);
    // System.out.println("Result::" + result);
    // }

    public static int factorial(int n) {
        int factn = 1;
        for (int i = n; i >= 1; i--) {
            factn *= i;
        }
        return factn;
    }

    public static void ans(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int result = fact_n / (fact_r * fact_nmr);
        System.out.println("result::" + result);
    }

    public static void main(String[] args) {
        int n = 8;
        int r = 7;
        ans(n, r);
    }
}
