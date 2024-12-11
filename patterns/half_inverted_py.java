package patterns;
import java.util.*;
public class half_inverted_py {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Rows");
        int x=sc.nextInt();
        sc.close();
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.print("\n");
            
        }
       

    }
}
