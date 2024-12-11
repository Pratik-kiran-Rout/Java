package patterns;
import java.util.*;
public class floyds_tringle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=1;
        System.out.println("Enter the row number");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+x++);
                // x=x+1
            }
            System.out.println("\n");
        }
        
    }
    
}
 