import java.util.*;
public class sum_of_natu {
    // for loop
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
      for(int i=1;i<=n;i++){
        System.out.println(i);
        sum=sum+i;
        
      }
      System.out.println(" The sum of n natural number is \n"+(sum));
    }
    
}
