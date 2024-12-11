import java.util.*;
public class greeting_by_switch {
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number between 1-3");
        int button=sc.nextInt();
        switch(button)
        {
         case 1:System.out.println("Hello");
         break;

         case 2:System.out.println("Namaste");
         break;

         case 3:System.out.println("Bonjour");
         break;

         default:System.out.println("Invalid"); 
        }

        sc.close();
    }
}
    
