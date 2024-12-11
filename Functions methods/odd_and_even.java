import java.util.*;
public class odd_and_even {
    public static int  oddAndEven(int a){
      if(a%2==0){
        return 1;
      }
        else
        return 0;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        int even_odd=oddAndEven(x);
        if(even_odd==1)
        {
            System.out.println("even number");
        }
        else
        System.out.println("odd number");
        System.out.println(); // function calling and print
        sc.close();
    }
    
}
