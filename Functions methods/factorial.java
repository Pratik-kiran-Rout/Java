import java.util.*;
public class factorial {
    public static int factorialofnumber(int n){
       
        int facto=1;
        for(int i=n;i>=1;i--){
            facto=facto*i;
        }
        return facto;
     }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number ");
        int x=sc.nextInt();
        int fac=factorialofnumber(x);
        System.out.println("The factorial is "+fac);
        sc.close();

    }
}

