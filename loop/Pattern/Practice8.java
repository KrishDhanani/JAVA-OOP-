package loop.Pattern;

public class Practice8 {
    public static void main(String[] args) {
        /*Revers hill pattern */
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<n-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
