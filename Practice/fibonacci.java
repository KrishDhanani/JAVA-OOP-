package Practice;
import java.util.Scanner;
public class fibonacci {
    static int fi(int x){

    
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
            return fi(x-1)+fi(x-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term of element you require:");
        int x = sc.nextInt();
        for(int i=0;i<=x;i++){
            System.out.println(fi(i));
        }
    }
}
