package loop.Pattern;

public class Practice5 {
    public static void main(String[] args) {
        /* Right sided triangle
                 *
                **
               ***
              ****
             *****  */
              int n=5;
              for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    System.out.print("  ");
                }
                for(int l=0;l<i;l++){
                    System.out.print("* ");
                } 
                System.out.println();
              }
    }
}
