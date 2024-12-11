import java.util.*;
// greatest amoung two number
public class question_3 {
    public static void greatest(int a, int b){
        if(a>b){
            System.out.println(" The greatest number is "+a);
        }
        else{
            System.out.println("The greatest number is "+b);
        }
      return ;
      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int x=sc.nextInt();
        System.out.println("Enter the Second number");
        int y=sc.nextInt();
          greatest(x, y);
        sc.close();
    }
    
}
