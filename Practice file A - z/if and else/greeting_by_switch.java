import java.util.*;
public class greeting_by_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button number ! 1-2-3 ");
        int button = sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello !");
            break ;

            case 2:System.out.println("Namaste !");
            break ;

            case 3:System.out.println("Bonjour !");
            break ; 

            default:System.out.println("Invalid Number !");
            // there is no need of using break because it is the last statement
        }
        sc.close();
    }
    
    
}
