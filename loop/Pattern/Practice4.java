package loop.Pattern;

public class Practice4 {
    public static void main(String[] args) {
        // Decreasing pattern
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
