    import java.util.*;
     public class m2_even_odd {
    public static int  oddAndEven(int a){
      if(a%2==0){
        System.out.println("even number ");
      }
        else
      System.out.println("odd number ");
    
    return 0;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
         oddAndEven(x); // here function calling 
        sc.close();
    }
    


}
